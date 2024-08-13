package com.pps.claims.datasync.dto;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReasonTypeLkpDto {
	
	@SerializedName("reason_type_id")
	private long reasonTypeId;

	@SerializedName("reason_type_code")
	private char reasonTypeCode;

	@SerializedName("reason_type_desc")
	private String reasonTypeDesc;

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
