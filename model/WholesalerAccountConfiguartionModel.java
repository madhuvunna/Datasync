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
@Table(name = "wholesaler_account_configuration", schema = "shared_data")
public class WholesalerAccountConfiguartionModel {
	@Id
	@Column(name ="wholesaler_account_config_id")
	private Long wholesalerAccountConfigId;
	
	@Column(name ="client_id")
	private Long clientId;
	
	@Column(name ="phid")
	private Long phId;
	
	@Column(name ="wholesaler_account_id")
	private Long wholesalerAccountId;
	
	@Column(name ="inactive_flag")
	private char inactiveFlag;
	
	@Column(name ="ph_group_id")
	private Long phGroupId;
	
	@Column(name ="wholesaler_type_id")
	private long wholesalerTypeId;
	
	@Column(name ="out_bound_file_entity_id_for_850")
	private long outBoundFileEntityIdFor850;
	
	@Column(name ="created_by_id")
	private Long createdById;
	
	@Column(name ="created_date")
	private Long createdDate;
	
	@Column(name ="modified_by_id")
	private Long modifiedById;
	
	@Column(name ="modified_date")
	private Long modifiedDate;
}
