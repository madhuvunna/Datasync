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
@Table(name = "reason_type_lkp", schema = "shared_data")
public class ReasonTypeLkpModel {
	@Id
	@Column(name ="reason_type_id")
	private long reasonTypeId;

	@Column(name ="reason_type_code")
	private char reasonTypeCode;

	@Column(name ="reason_type_desc")
	private String reasonTypeDesc;

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
