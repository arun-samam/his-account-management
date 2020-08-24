package com.his.am.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.his.am.entity.CaseWorkerEntity;

@Repository
public interface CaseWorkerRepository extends JpaRepository<CaseWorkerEntity, Serializable> {

}
