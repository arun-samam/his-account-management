package com.his.am.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.his.am.service.AdminService;

@Controller
public class ViewAccountController {

	@Autowired
	public AdminService service;
	
	@GetMapping("/viewaccounts")
	public String viewAccountsLink(Model model) {
		return "viewaccounts";
	}
	
	@PostMapping("/viewaccounts")
	public String viewAccountsButton(Model model,HttpServletRequest req) {
		String viewrole = req.getParameter("viewrole");
		
		if("admin".equalsIgnoreCase(viewrole)) {
			//get List of Admin from service
			model.addAttribute("modellist", service.getAdminList());
		}else if("caseworker".equalsIgnoreCase(viewrole)) {
			//get List of caseworker from service
			model.addAttribute("modellist", service.getCaseWorkderList());
		}
		return "viewaccounts";
	}
}
