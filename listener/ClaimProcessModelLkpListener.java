package com.pps.claims.datasync.listener;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.pps.claims.datasync.common.DataSyncConstants;
import com.pps.claims.datasync.dto.ClaimProcessModelLkpDto;
import com.pps.claims.datasync.service.SyncTableService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ClaimProcessModelLkpListener {
	
	@Autowired
	private SyncTableService syncTableService;

	@KafkaListener(topics = "ClaimProcessModelLkp")
	public void listen(@Payload(required = false) String message) throws Exception {
		if (message != null) {

			String operation = "";
			ClaimProcessModelLkpDto dto = new ClaimProcessModelLkpDto();
			try {
				log.info("Message Received for ClaimProcessModelLkp Table");
				Object document = Configuration.defaultConfiguration().jsonProvider().parse(message);
				operation = JsonPath.read(document, "$.payload.op");
				HashMap<String, HashMap<String, String>> map = new HashMap<String, HashMap<String, String>>();
				if (operation.equalsIgnoreCase(DataSyncConstants.CREATED) || operation.equalsIgnoreCase(DataSyncConstants.UPDATED))
					map = JsonPath.read(document, "$.payload.after");
				else if (operation.equalsIgnoreCase(DataSyncConstants.DELETED))
					map = JsonPath.read(document, "$.payload.before");

				ObjectMapper mapper = new ObjectMapper();
				String jsonStr = mapper.writeValueAsString(map);

				Gson gson = new Gson();
				dto = gson.fromJson(jsonStr, ClaimProcessModelLkpDto.class);
				syncTableService.claimProcessModel(dto, operation);
			} catch (Exception exception) {
				log.error("Error occured while saving {} in 340B Direct+ : Operation : {}", dto, operation);
				log.error(exception.getMessage());
				throw new Exception();
			}
		}
	}

}
