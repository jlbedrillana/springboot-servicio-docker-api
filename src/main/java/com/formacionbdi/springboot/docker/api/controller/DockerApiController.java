package com.formacionbdi.springboot.docker.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class DockerApiController {

	@GetMapping("/prueba/{id}")
	public String respuestaPeticion(@PathVariable Long id) {
		
		return "OK : " + (id == null?100:200);
	}
	
}
