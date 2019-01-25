package com.bcp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bcp.demo.model.RegistroHoras;
import com.bcp.demo.service.IRegistroHorasService;


@Controller
@RequestMapping("/horas")
public class RegistroHorasController {
	
	@Autowired
	private IRegistroHorasService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String registrar(@RequestBody RegistroHoras hora) {	
		
		RegistroHoras horas = service.create(hora);
		return horas != null ? "1" : "0";
	}
	
}
