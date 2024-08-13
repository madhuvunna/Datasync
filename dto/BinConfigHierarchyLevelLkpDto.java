package com.pps.claims.datasync.dto;


import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BinConfigHierarchyLevelLkpDto {
	
	@SerializedName("bin_config_hierarchy_level_id")
	private long binConfigHierarchyLevelId;

	@SerializedName("bin_config_hierarchy_level_code")
	private char binConfigHierarchyLevelCode;

	@SerializedName("bin_config_hierarchy_level_desc")
	private String binConfigHierarchyLevelDesc;

	@SerializedName("bin_config_hierarchy_level_mapping")
	private String binConfigHierarchyLevelMapping;

	@SerializedName("bin_config_hierarchy_level_order")
	private long binConfigHierarchyLevelOrder;

	@SerializedName("inactive_flag")
	private char inactiveFlag;

	@SerializedName("created_by_id")
	private Long createdById;

	@SerializedName("created_date")
	private Long createdDate;
	
	@SerializedName("modified_by_id")
	private Long modifiedById;

	@SerializedName("modified_date")
	private Long modifiedDate;

}
