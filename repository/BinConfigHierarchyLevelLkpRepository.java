package com.pps.claims.datasync.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.pps.claims.datasync.model.BinConfigHierarchyLevelLkpModel;

@Repository
public interface BinConfigHierarchyLevelLkpRepository extends JpaRepository<BinConfigHierarchyLevelLkpModel, Long>{
	
	
	String binConfigHierarchyLevelLkpInsert = "INSERT INTO shared_data.bin_config_hierarchy_level_lkp("
			+ "bin_config_hierarchy_level_id, bin_config_hierarchy_level_code, bin_config_hierarchy_level_desc,"
			+ "bin_config_hierarchy_level_mapping, bin_config_hierarchy_level_order, inactive_flag, created_by_id, created_date,"
			+ "modified_by_id, modified_date)"
			+ "VALUES (:bin_config_hierarchy_level_id, :bin_config_hierarchy_level_code, :bin_config_hierarchy_level_desc,"
			+ ":bin_config_hierarchy_level_mapping, :bin_config_hierarchy_level_order, :inactive_flag, :created_by_id, :created_date,"
			+ ":modified_by_id, :modified_date);";

	@Modifying
	@Query(value = binConfigHierarchyLevelLkpInsert, nativeQuery = true)
	public void InsertIntobinConfigHierarchyLevelLkp(@Param("binConfigHierarchyLevelId") long binConfigHierarchyLevelId,
			@Param("binConfigHierarchyLevelCode") char binConfigHierarchyLevelCode,
			@Param("binConfigHierarchyLevelDesc") String binConfigHierarchyLevelDesc,
			@Param("binConfigHierarchyLevelMapping") String binConfigHierarchyLevelMapping,
			@Param("binConfigHierarchyLevelOrder") long binConfigHierarchyLevelOrder,
			@Param("inactiveFlag") char inactiveFlag, @Param("createdById") Long createdById,
			@Param("createdDate") Long createdDate, @Param("modifiedById") Long modifiedById,
			@Param("modifiedDate") Long modifiedDate);

}
