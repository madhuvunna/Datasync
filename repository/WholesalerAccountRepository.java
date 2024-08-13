package com.pps.claims.datasync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pps.claims.datasync.model.WholesalerAccountModel;

@Repository
public interface WholesalerAccountRepository extends JpaRepository<WholesalerAccountModel, Long>{
	
	String wholesalerAccountInsert = "INSERT INTO shared_data.wholesaler_account("
			+ "wholesaler_account_id, wholesaler_account_type_id, wholesaler_id, wholesaler_account_code, wholesaler_division_code,"
			+ "wholesaler_account_division_code, inactive_flag, entity_address_id, wholesaler_type_id, wholesaler_account_status_id, created_by_id, created_date, modified_by_id, modified_date)"
			+ "VALUES (:wholesaler_account_id, :wholesaler_account_type_id, :wholesaler_id, :wholesaler_account_code, :wholesaler_division_code, :wholesaler_account_division_code, :inactive_flag, :entity_address_id, :wholesaler_type_id, :wholesaler_account_status_id,"
			+ ":created_by_id, :created_date, :modified_by_id, :modified_date);";

	@Modifying
	@Query(value = wholesalerAccountInsert, nativeQuery = true)
	public void insertIntowholesalerAccount(@Param("wholesalerAccountId") Long wholesalerAccountId,
			@Param("wholesalerAccountTypeId") Long wholesalerAccountTypeId, @Param("wholesaleId") Long wholesaleId,
			@Param("wholesalerAccountCode") String wholesalerAccountCode, @Param("inactiveFlag") char inactiveFlag,
			@Param("wholesalerDivisionCode") String wholesalerDivisionCode,
			@Param("wholesalerAccountDivisionCode") String wholesalerAccountDivisionCode,
			@Param("entityAddressId") Long entityAddressId, @Param("wholesalerTypeId") long wholesalerTypeId,
			@Param("wholesalerAccountStatusId") long wholesalerAccountStatusId, @Param("createdById") Long createdById,
			@Param("modifiedById") Long modifiedById, @Param("createdDate") Long createdDate,
			@Param("modifiedDate") Long modifiedDate);

}
