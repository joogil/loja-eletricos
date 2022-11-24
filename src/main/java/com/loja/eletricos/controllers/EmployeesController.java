package com.loja.eletricos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeesController {
	
	@GetMapping("/employees/register")
	public String register() {
		return "admin/employees/register";
	}
	
	@GetMapping("/employees/list")
	public String list() {
		return "admin/employees/list";
	}
}
