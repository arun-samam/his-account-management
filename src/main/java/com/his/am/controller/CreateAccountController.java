package com.his.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.his.am.model.Admin;
import com.his.am.service.AdminService;

@Controller
public class CreateAccountController {

	@Autowired
	private AdminService aservice;
	
	@GetMapping("/createaccount")
	public String showCreateAccountForm(Model model) {
		model.addAttribute("admin", new Admin());
		return "createaccount";
	}
	
	@PostMapping("/createaccount")
	@ResponseBody
	public String handleCreateButton(@ModelAttribute("admin") Admin admin) {
		System.out.println(admin);
		if("admin".equalsIgnoreCase(admin.getRole())){
			aservice.createAdmin(admin);
		}else if("caseworker".equalsIgnoreCase(admin.getRole())) {
			aservice.createCaseWorker(admin);
		}
		return "<h2>account creation success !!!</h2>";
	}
}
