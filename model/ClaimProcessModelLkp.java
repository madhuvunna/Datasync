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
@Table(name = "claim_process_model_lkp", schema = "shared_data")
public class ClaimProcessModelLkp {
	@Id
	@Column(name = "claim_process_model_id")
	private long claimProcessModelId;

	@Column(name = "claim_process_model_code")
	private char claimProcessModelCode;

	@Column(name = "claim_process_model")
	private String claimProcessModel;

	@Column(name = "inactive_flag")
	private char inactiveFlag;

	@Column(name = "created_by_id")
	private Long createdById;

	@Column(name = "modified_by_id")
	private Long modifiedById;

	@Column(name = "modified_date")
	private Long modifiedDate;

	@Column(name = "created_date")
	private Long createdDate;

}
