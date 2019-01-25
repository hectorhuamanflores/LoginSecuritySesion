package com.bcp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.demo.model.RegistroHoras;
import com.bcp.demo.repository.IRegistroHorasRepo;

@Service
public class RegistroServiceImpl implements IRegistroHorasService   {
    
	@Autowired
	private IRegistroHorasRepo repository;
	
	@Override
	public List<RegistroHoras> findAll() {
		 return repository.findAll();
	}

	@Override
	public RegistroHoras create(RegistroHoras hora) {
		 return repository.save(hora);
	}

	@Override
	public RegistroHoras find(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public RegistroHoras update(RegistroHoras hora) {
		return repository.save(hora);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);	
	}

}
