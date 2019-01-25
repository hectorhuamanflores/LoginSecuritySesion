package com.bcp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrabajoController {
    
	
	@RequestMapping("/trabajo")
	public String irNota(Model model) {
		return "trabajo";
	}
	
}
