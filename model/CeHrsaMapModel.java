package com.pps.claims.datasync.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ce_hrsa_map", schema = "shared_data")
public class CeHrsaMapModel {
	@Id
	@Column(name = "ce_hrsa_map_id")
	private Long ceHrsaMapId;

	@Column(name = "parent_ceid")
	private Long parentCeId;

	@Column(name = "hrsa_id")
	private String hrsaId;

	@Column(name = "ce_type_id")
	private long cetypeId;

	@Column(name = "hrsa_alias_name")
	private String hrsaAliasName;

	@Column(name = "entity_address_id")
	private Long entityAdressId;

	@Column(name = "primary_ce_hrsa_map_id")
	private Long primaryCeHrsaMapId;

	@Column(name = "termination_date")
	private Date terminationDate;

	@Column(name = "is_deletable_flag")
	private char isDeletableFlag;

	@Column(name = "inactive_flag")
	private char inactiveFlag;
}
