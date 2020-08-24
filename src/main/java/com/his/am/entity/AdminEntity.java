package com.his.am.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ADMIN_TABLE")
@Entity
public class AdminEntity extends DateAudit {

	@Id
	private String email;
	private String firstName;
	private String lastName;
	private String gender;
	
	@Column(name = "ACTIVE_SWICH")
	private Boolean isActive;
}
