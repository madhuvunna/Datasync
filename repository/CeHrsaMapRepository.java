package com.pps.claims.datasync.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pps.claims.datasync.model.CeHrsaMapModel;

@Repository
public interface CeHrsaMapRepository extends JpaRepository<CeHrsaMapModel, Long>{

	final String ceHrsaMapInsert = "INSERT INTO shared_data.ce_hrsa_map("
			+ "ce_hrsa_map_id, parent_ceid, hrsa_id, ce_type_id, hrsa_alias_name, entity_address_id, primary_ce_hrsa_map_id,"
			+ "termination_date, is_deletable_flag, inactive_flag, created_by_id, created_date, modified_by_id, modified_date)"
			+ "VALUES (:ce_hrsa_map_id, :parent_ceid, :hrsa_id, :ce_type_id, :hrsa_alias_name, :entity_address_id, :primary_ce_hrsa_map_id,"
			+ ":termination_date, :is_deletable_flag, :inactive_flag, :created_by_id, :created_date, :modified_by_id, :modified_date)";

	@Modifying
	@Query(value = ceHrsaMapInsert, nativeQuery = true)
	public void insertIntoceHrsaMap(@Param("primaryCeHrsaMapId") Long primaryCeHrsaMapId,
			@Param("parentCeId") Long parentCeId, @Param("ceHrsaMapId") Long ceHrsaMapId,
			@Param("entityAdressId") Long entityAdressId, @Param("hrsaAliasName") String hrsaAliasName,
			@Param("hrsaId") String hrsaId, @Param("inactiveFlag") char inactiveFlag,
			@Param("isDeletableFlag") char isDeletableFlag, @Param("createdById") Long createdById,
			@Param("cetypeId") long cetypeId, @Param("modifiedById") Long modifiedById,
			@Param("createdDate") Long createdDate, @Param("modifiedDate") Long modifiedDate,
			@Param("terminationDate") Date terminationDate);
	

}
