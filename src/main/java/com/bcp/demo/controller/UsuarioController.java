package com.bcp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bcp.demo.model.Usuario;
import com.bcp.demo.service.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
	@Autowired
	private IUsuarioService servicio;
	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Usuario> listar(){
		
		return servicio.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Usuario listarId(@PathVariable(value = "id")Integer id){
		
		return servicio.find(id);
	}
}
