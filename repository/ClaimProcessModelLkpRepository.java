package com.pps.claims.datasync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pps.claims.datasync.model.ClaimProcessModelLkp;

@Repository
public interface ClaimProcessModelLkpRepository extends JpaRepository<ClaimProcessModelLkp, Long> {
	
	

	final String claimProcessModelLkpInsert = "INSERT INTO shared_data.claim_process_model_lkp("
			+ "claim_process_model_id, claim_process_model_code, claim_process_model, inactive_flag, created_by_id, created_date,"
			+ "modified_by_id, modified_date)"
			+ "VALUES (:claim_process_model_id, :claim_process_model_code, :claim_process_model, :inactive_flag, :created_by_id, :created_date,"
			+ ":modified_by_id, :modified_date);";
		
	@Modifying
	@Query(value=claimProcessModelLkpInsert ,nativeQuery=true)
	public void insertIntoclaimProcessModelLkp(@Param("claimProcessModelId") long claimProcessModelId,
			@Param("claimProcessModelCode") char claimProcessModelCode,
			@Param("claimProcessModel") String claimProcessModel, @Param("inactiveFlag") char inactiveFlag,
			@Param("createdById") Long createdById, @Param("modifiedById") Long modifiedById,
			@Param("createdDate") Long createdDate, @Param("modifiedDate") Long modifiedDate) ;

	


}
