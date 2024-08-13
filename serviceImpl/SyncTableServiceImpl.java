package com.pps.claims.datasync.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pps.claims.datasync.dto.BinConfigHierarchyLevelLkpDto;
import com.pps.claims.datasync.dto.CeHrsaMapDto;
import com.pps.claims.datasync.dto.ClaimProcessModelLkpDto;
import com.pps.claims.datasync.dto.ReasonTypeLkpDto;
import com.pps.claims.datasync.dto.WholesalerAccountConfigurationDto;
import com.pps.claims.datasync.dto.WholesalerAccountDto;
import com.pps.claims.datasync.model.BinConfigHierarchyLevelLkpModel;
import com.pps.claims.datasync.model.CeHrsaMapModel;
import com.pps.claims.datasync.model.ClaimProcessModelLkp;
import com.pps.claims.datasync.model.ReasonTypeLkpModel;
import com.pps.claims.datasync.model.WholesalerAccountConfiguartionModel;
import com.pps.claims.datasync.model.WholesalerAccountModel;
import com.pps.claims.datasync.repository.BinConfigHierarchyLevelLkpRepository;
import com.pps.claims.datasync.repository.CeHrsaMapRepository;
import com.pps.claims.datasync.repository.ClaimProcessModelLkpRepository;
import com.pps.claims.datasync.repository.ReasonTypeLkpRepository;
import com.pps.claims.datasync.repository.WholesalerAccountConfigurationRepository;
import com.pps.claims.datasync.repository.WholesalerAccountRepository;
import com.pps.claims.datasync.service.SyncTableService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SyncTableServiceImpl implements SyncTableService {

	private final String created = "c";
	private final String updated = "u";
	private final String deleted = "d";

	/*
	 * @Autowired private CeHrsaMapRepository ceHrsaMapRepository;
	 */
    
    @Autowired
    private ClaimProcessModelLkpRepository claimProcessModelLkpRepository;
    
    @Autowired
    private BinConfigHierarchyLevelLkpRepository binConfigHierarchyLevelLkpRepository;
    
    @Autowired
    private WholesalerAccountConfigurationRepository wholesalerAccountConfigurationRepository;
    
    @Autowired
    private WholesalerAccountRepository wholesalerAccountRepository;
    
    @Autowired
    private ReasonTypeLkpRepository reasonTypeLkpRepository;
    
	@Override
	
	public void claimProcessModel(ClaimProcessModelLkpDto dto, String operation) {
		if (created.equalsIgnoreCase(operation)) {
			ClaimProcessModelLkp claimProcessModelLkp = new ClaimProcessModelLkp();
			BeanUtils.copyProperties(dto, claimProcessModelLkp);
			claimProcessModelLkpRepository.save(claimProcessModelLkp);
			log.info("ClaimProcessModelLkp Table  record inserted");
		}
	}

	@Override
	
	public void ceHrsaMap(CeHrsaMapDto dto, String operation) {
		if (created.equalsIgnoreCase(operation)) {
			CeHrsaMapModel ceHrsaMapModel = new CeHrsaMapModel();
			BeanUtils.copyProperties(dto, ceHrsaMapModel);
			//ceHrsaMapRepository.save(ceHrsaMapModel);
			log.info("CeHrsaMAp Table  record inserted");
		}
	}

	@Override
	
	public void binConfigHierarchyLevel(BinConfigHierarchyLevelLkpDto dto, String operation) {
		if (created.equalsIgnoreCase(operation)) {
			BinConfigHierarchyLevelLkpModel binConfigHierarchyLevelLkpModel = new BinConfigHierarchyLevelLkpModel();
			BeanUtils.copyProperties(dto, binConfigHierarchyLevelLkpModel);
			binConfigHierarchyLevelLkpRepository.save(binConfigHierarchyLevelLkpModel);
			log.info("binConfigHierarchyLevellkp Table  record inserted");
		}
	}
	/*
	 * @Override public void binConfiguration(BinConfigurationDto dto, String
	 * operation) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void wholesalerAccountConfiguration(WholesalerAccountConfigurationDto dto, String operation) {
		if (created.equalsIgnoreCase(operation)) {
			WholesalerAccountConfiguartionModel wholesalerAccountConfiguartionModel = new WholesalerAccountConfiguartionModel();
			BeanUtils.copyProperties(dto, wholesalerAccountConfiguartionModel);
			wholesalerAccountConfigurationRepository.save(wholesalerAccountConfiguartionModel);
			log.info("wholesalerAccountConfiguration Table  record inserted");
		}
	}
	@Override
	
	public void wholesalerAccount(WholesalerAccountDto dto, String operation) {
		if (created.equalsIgnoreCase(operation)) {
			WholesalerAccountModel wholesalerAccountModel = new WholesalerAccountModel();
			BeanUtils.copyProperties(dto, wholesalerAccountModel);
			wholesalerAccountRepository.save(wholesalerAccountModel);
			log.info("wholesalerAccount Table  record inserted");
		}
	}

	@Override
	
	public void reasonTypeLkp(ReasonTypeLkpDto dto, String operation) {
		if(created.equalsIgnoreCase(operation)) {
			ReasonTypeLkpModel reasonTypeLkpModel=new ReasonTypeLkpModel();
			BeanUtils.copyProperties(dto, reasonTypeLkpModel);
			reasonTypeLkpRepository.save(reasonTypeLkpModel);
			log.info("reasonTypeLkp Table  record inserted");
	}
}
}