package com.pps.claims.datasync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pps.claims.datasync.model.WholesalerAccountConfiguartionModel;

@Repository
public interface WholesalerAccountConfigurationRepository extends JpaRepository<WholesalerAccountConfiguartionModel, Long>{

	String wholesalerAccountConfigurationInsert = "INSERT INTO shared_data.wholesaler_account_configuration("
			+ "wholesaler_account_config_id, client_id, phid, wholesaler_account_id, inactive_flag, ph_group_id, wholesaler_type_id,"
			+ "out_bound_file_entity_id_for_850, created_by_id, created_date, modified_by_id, modified_date)"
			+ "VALUES (:wholesaler_account_config_id, :client_id, :phid, :wholesaler_account_id, :inactive_flag, :ph_group_id, :wholesaler_type_id,"
			+ ":out_bound_file_entity_id_for_850, :created_by_id, :created_date, :modified_by_id, :modified_date);";

	@Modifying
	@Query(value = wholesalerAccountConfigurationInsert, nativeQuery = true)
	public void insertIntowholesalerAccountConfiguration(@Param("wholesalerAccountConfigId") Long wholesalerAccountConfigId,
			@Param("clientId") Long clientId, @Param("phId") Long phId,
			@Param("wholesalerAccountId") Long wholesalerAccountId, @Param("inactiveFlag") char inactiveFlag,
			@Param("phGroupId") Long phGroupId, @Param("wholesalerTypeId") long wholesalerTypeId,
			@Param("outBoundFileEntityIdFor850") long outBoundFileEntityIdFor850,
			@Param("createdById") Long createdById, @Param("modifiedById") Long modifiedById,
			@Param("createdDate") Long createdDate, @Param("modifiedDate") Long modifiedDate);

}
