package com.bcp.demo.service;

import java.util.List;

import com.bcp.demo.model.RegistroHoras;



public interface IRegistroHorasService {
	
	List<RegistroHoras> findAll();

	RegistroHoras create(RegistroHoras hora);

	RegistroHoras find(Integer id);

	RegistroHoras update(RegistroHoras hora);

	void delete(Integer id);
	
}
