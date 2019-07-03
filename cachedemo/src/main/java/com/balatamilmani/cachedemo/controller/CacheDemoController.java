package com.balatamilmani.cachedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.balatamilmani.cachedemo.service.ICacheDemoService;

@RestController
public class CacheDemoController {

	@Autowired
	ICacheDemoService service;
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello";
	}
	
	@GetMapping("/getDummyData/{id}")
	public String getDummyData(@PathVariable String id) {
		return service.getCachableData(id);
	}
}
