package com.pps.claims.datasync.dto;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClaimProcessModelLkpDto {
	
	@SerializedName("claim_process_model_id")
	private long claimProcessModelId;
	
	@SerializedName("claim_process_model_code")
	private char claimProcessModelCode;
	
	@SerializedName("claim_process_model")
	private String claimProcessModel;
	
	@SerializedName("inactive_flag")
	private char inactiveFlag;
	
	@SerializedName("created_by_id")
	private Long createdById;
	
	@SerializedName("modified_by_id")
	private Long modifiedById;
	
	@SerializedName("modified_date")
	private Long modifiedDate;
	
	@SerializedName("created_date")
	private Long createdDate;

}
