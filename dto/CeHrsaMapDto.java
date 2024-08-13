package com.pps.claims.datasync.dto;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CeHrsaMapDto {
	@SerializedName("ce_hrsa_map_id")
	private Long ceHrsaMapId;
	
	@SerializedName("parent_ceid")
	private Long parentCeId;
	
	@SerializedName("hrsa_id")
	private String hrsaId;
	
	@SerializedName("ce_type_id")
	private long cetypeId;
	
	@SerializedName("hrsa_alias_name")
	private String hrsaAliasName;
	
	@SerializedName("entity_address_id")
	private Long entityAdressId;
	
	@SerializedName("primary_ce_hrsa_map_id")
	private Long primaryCeHrsaMapId;
	
	@SerializedName("termination_date")
	private Date terminationDate;
	
	@SerializedName("is_deletable_flag")
	private char isDeletableFlag;
	
	@SerializedName("inactive_flag")
	private char inactiveFlag;
	
	@SerializedName("created_by_id")
	private Long createdById;
	
	@SerializedName("modified_by_id")
	private Long modifiedById;
	
	
	@SerializedName("created_date")
	private Long createdDate;
	
	@SerializedName("modified_date")
	private Long modifiedDate;

}
