package com.mylab.rest.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mylab.rest.dto.HelloEarth;
import com.mylab.rest.service.InstanceInformationService;

@RestController
public class HelloEarthResource {
	
	@Autowired
	private InstanceInformationService service;

	@GetMapping(path = "/")
	public String imUpAndRunning() {
		return "{healthy:true}";
	}

	@GetMapping(path = "/hello-earth")
	public String helloEarth() {
		return "Hello Earth " + " V1 " + service.retrieveInstanceInfo();
	}

	@GetMapping(path = "/hello-earth-structure")
	public HelloEarth helloEarthStructure() {
		return new HelloEarth("Hello Earth");
	}

	@GetMapping(path = "/hello-earth/{message}")
	public HelloEarth helloEarthMessage(@PathVariable String message) {
		return new HelloEarth(String.format("Hello Earth, %s", message));
	}
}