package com.narendra.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narendra.microservices.limitsservice.Bean.Limits;
import com.narendra.microservices.limitsservice.Configaration.Configuration;



@RestController
public class LimitController {
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public Limits retrievLimits() {
		// return new Limits(1,100)
		return new Limits(configuration.getMinimum(), configuration.getMaximum());

	}
}
