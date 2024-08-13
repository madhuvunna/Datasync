package com.pps.claims.datasync.dto;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WholesalerAccountDto {

	@SerializedName("wholesaler_account_id")
	private Long wholesalerAccountId;

	@SerializedName("wholesaler_account_type_id")
	private Long wholesalerAccountTypeId;

	@SerializedName("wholesaler_id")
	private Long wholesaleId;

	@SerializedName("wholesaler_account_code")
	private String wholesalerAccountCode;

	@SerializedName("wholesaler_division_code")
	private String wholesalerDivisionCode;

	@SerializedName("wholesaler_account_division_code")
	private String wholesalerAccountDivisionCode;

	@SerializedName("inactive_flag")
	private char inactiveFlag;

	@SerializedName("entity_address_id")
	private Long entityAddressId;

	@SerializedName("wholesaler_type_id")
	private long wholesalerTypeId;

	@SerializedName("wholesaler_account_status_id")
	private long wholesalerAccountStatusId;

	@SerializedName("created_by_id")
	private Long createdById;

	@SerializedName("created_date")
	private Long createdDate;

	@SerializedName("modified_by_id")
	private Long modifiedById;

	@SerializedName("modified_date")
	private Long modifiedDate;
}
