package com.pps.claims.datasync.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "bin_config_hierarchy_level_lkp", schema = "shared_data")
public class BinConfigHierarchyLevelLkpModel {
	
	@Id
	@Column(name ="bin_config_hierarchy_level_id")
	private long binConfigHierarchyLevelId;

	@Column(name ="bin_config_hierarchy_level_code")
	private char binConfigHierarchyLevelCode;

	@Column(name ="bin_config_hierarchy_level_desc")
	private String binConfigHierarchyLevelDesc;

	@Column(name ="bin_config_hierarchy_level_mapping")
	private String binConfigHierarchyLevelMapping;

	@Column(name ="bin_config_hierarchy_level_order")
	private long binConfigHierarchyLevelOrder;

	@Column(name ="inactive_flag")
	private char inactiveFlag;

	@Column(name ="created_by_id")
	private Long createdById;

	@Column(name ="created_date")
	private Long createdDate;
	
	@Column(name ="modified_by_id")
	private Long modifiedById;

	@Column(name ="modified_date")
	private Long modifiedDate;

}
