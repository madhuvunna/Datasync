package com.pps.claims.datasync.dto;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WholesalerAccountConfigurationDto {

	@SerializedName("wholesaler_account_config_id")
	private Long wholesalerAccountConfigId;
	
	@SerializedName("client_id")
	private Long clientId;
	
	@SerializedName("phid")
	private Long phId;
	
	@SerializedName("wholesaler_account_id")
	private Long wholesalerAccountId;
	
	@SerializedName("inactive_flag")
	private char inactiveFlag;
	
	@SerializedName("ph_group_id")
	private Long phGroupId;
	
	@SerializedName("wholesaler_type_id")
	private long wholesalerTypeId;
	
	@SerializedName("out_bound_file_entity_id_for_850")
	private long outBoundFileEntityIdFor850;
	
	@SerializedName("created_by_id")
	private Long createdById;
	
	@SerializedName("created_date")
	private Long createdDate;
	
	@SerializedName("modified_by_id")
	private Long modifiedById;
	
	@SerializedName("modified_date")
	private Long modifiedDate;
}
