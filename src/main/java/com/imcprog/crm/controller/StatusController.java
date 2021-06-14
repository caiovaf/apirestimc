package com.imcprog.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@GetMapping(path = "/imc/status")
	public String check() {
		return "Online";
	}
	
}