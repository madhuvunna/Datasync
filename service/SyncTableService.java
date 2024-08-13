package com.pps.claims.datasync.service;

import com.pps.claims.datasync.dto.BinConfigHierarchyLevelLkpDto;
import com.pps.claims.datasync.dto.BinConfigurationDto;
import com.pps.claims.datasync.dto.CeHrsaMapDto;
import com.pps.claims.datasync.dto.ClaimProcessModelLkpDto;
import com.pps.claims.datasync.dto.ReasonTypeLkpDto;
import com.pps.claims.datasync.dto.WholesalerAccountConfigurationDto;
import com.pps.claims.datasync.dto.WholesalerAccountDto;

public interface SyncTableService {

	public void claimProcessModel(ClaimProcessModelLkpDto dto, String operation);

	public void ceHrsaMap(CeHrsaMapDto dto, String operation);

	//public void binConfiguration(BinConfigurationDto dto, String operation);

	public void binConfigHierarchyLevel(BinConfigHierarchyLevelLkpDto dto, String operation);

	public void wholesalerAccountConfiguration(WholesalerAccountConfigurationDto dto, String operation);

	public void wholesalerAccount(WholesalerAccountDto dto, String operation);

	public void reasonTypeLkp(ReasonTypeLkpDto dto, String operation);

}
