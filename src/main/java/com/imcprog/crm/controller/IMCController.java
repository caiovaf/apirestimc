package com.imcprog.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imcprog.crm.model.IMCModel;

@RestController
@RequestMapping("/imc")
public class IMCController {
	
	@GetMapping
	public String registrar(@RequestBody IMCModel imc) {
		new IMCModel(imc.getPeso(),imc.getAltura());
		return imc.respota();
	}
	

	
	
	
}
