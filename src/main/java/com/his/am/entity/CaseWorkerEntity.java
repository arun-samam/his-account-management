package com.his.am.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "CW_TABLE")
@Entity
public class CaseWorkerEntity extends DateAudit{

	@Id
	private String email;
	private String firstName;
	private String lastName;
	private String gender;
	
}
