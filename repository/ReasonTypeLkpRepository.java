package com.pps.claims.datasync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pps.claims.datasync.model.ReasonTypeLkpModel;

@Repository
public interface ReasonTypeLkpRepository extends JpaRepository<ReasonTypeLkpModel, Long> {
	
	String reasonTyepLkpInsert = "INSERT INTO shared_data.reason_type_lkp("
			+ "reason_type_id, reason_type_code, reason_type_desc, inactive_flag, created_by_id, created_date, modified_by_id, modified_date)"
			+ "VALUES (:reason_type_id, :reason_type_code, :reason_type_desc, :inactive_flag, :created_by_id, :created_date, :modified_by_id, :modified_date);";

	@Modifying
	@Query(value = reasonTyepLkpInsert, nativeQuery = true)
	public void InsertIntoreasonTypeLkp(@Param("reasonTypeId") long reasonTypeId,
			@Param("reasonTypeCode") char reasonTypeCode, @Param("reasonTypeDesc") String reasonTypeDesc,
			@Param("inactiveFlag") char inactiveFlag, @Param("createdById") Long createdById,
			@Param("createdDate") Long createdDate, @Param("modifiedById") Long modifiedById,
			@Param("modifiedDate") Long modifiedDate);

	

}
