package com.his.am.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.his.am.entity.CaseWorkerEntity;

@Repository
public interface CaseWorkerRepository extends JpaRepository<CaseWorkerEntity, Serializable> {

	
	@Modifying
	@Query("update CaseWorkerEntity ce set ce.isActive=false where ce.email=?1")
	public void softDelete(String email);
}
