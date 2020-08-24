package com.his.am.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.his.am.entity.AdminEntity;

@Repository
public interface AdminEntityRepository extends JpaRepository<AdminEntity, Serializable> {

	
}
