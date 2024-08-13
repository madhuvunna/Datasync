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
@Table(name = "wholesaler_accont", schema = "shared_data")
public class WholesalerAccountModel {

	@Id
	@Column(name ="wholesaler_account_id")
	private Long wholesalerAccountId;

	@Column(name ="wholesaler_account_type_id")
	private Long wholesalerAccountTypeId;

	@Column(name ="wholesaler_id")
	private Long wholesaleId;

	@Column(name ="wholesaler_account_code")
	private String wholesalerAccountCode;

	@Column(name ="wholesaler_division_code")
	private String wholesalerDivisionCode;

	@Column(name ="wholesaler_account_division_code")
	private String wholesalerAccountDivisionCode;

	@Column(name ="inactive_flag")
	private char inactiveFlag;

	@Column(name ="entity_address_id")
	private Long entityAddressId;

	@Column(name ="wholesaler_type_id")
	private long wholesalerTypeId;

	@Column(name ="wholesaler_account_status_id")
	private long wholesalerAccountStatusId;

	@Column(name ="created_by_id")
	private Long createdById;

	@Column(name ="created_date")
	private Long createdDate;

	@Column(name ="modified_by_id")
	private Long modifiedById;

	@Column(name ="modified_date")
	private Long modifiedDate;
}
