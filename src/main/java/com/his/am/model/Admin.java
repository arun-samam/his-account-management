package com.his.am.model;

import javax.persistence.Column;

import lombok.Data;

@Data
public class Admin {

	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String role;
	
	private boolean isActive;
}
