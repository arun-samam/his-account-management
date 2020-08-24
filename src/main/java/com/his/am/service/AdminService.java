package com.his.am.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.his.am.entity.AdminEntity;
import com.his.am.entity.CaseWorkerEntity;
import com.his.am.model.Admin;
import com.his.am.repository.AdminEntityRepository;
import com.his.am.repository.CaseWorkerRepository;

@Service
public class AdminService {

	@Autowired
	private AdminEntityRepository arepo;
	
	@Autowired
	private CaseWorkerRepository crepo;
	
	
	public String createAdmin(Admin model) {
		
		AdminEntity entity = new AdminEntity();
		
		BeanUtils.copyProperties(model, entity);
		arepo.save(entity);
		
		return "";
	}
	
	public String createCaseWorker(Admin model) {
		
		CaseWorkerEntity entity = new CaseWorkerEntity();
		
		BeanUtils.copyProperties(model, entity);
		crepo.save(entity);
		
		return "";
	}
	
	public List<Admin> getAdminList(){
		List<Admin> admins = new ArrayList<Admin>();
		
		arepo.findAll().forEach(adminentity->{
			Admin admin = new Admin();
			BeanUtils.copyProperties(adminentity, admin);
			admins.add(admin);
		});
		
		return admins;
	}
	
	public List<Admin> getCaseWorkderList(){
		List<Admin> cwList = new ArrayList<Admin>();
		
		crepo.findAll().forEach(entity->{
			Admin admin = new Admin();
			BeanUtils.copyProperties(entity, admin);
			cwList.add(admin);
		});
		
		return cwList;
	}
}
