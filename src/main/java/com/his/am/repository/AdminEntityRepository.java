package com.his.am.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.his.am.entity.AdminEntity;

@Repository
public interface AdminEntityRepository extends JpaRepository<AdminEntity, Serializable> {

	@Modifying
	@Query("update AdminEntity ae set ae.isActive=false where ae.email=?1")
	public void softDelete(String email);
}
