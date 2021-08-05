package com.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConsumeController {
	
	@Autowired
	ConsumeClient consumeClient;
	
	@GetMapping
	@RequestMapping(value = "/consume", method = RequestMethod.GET)
	public String consumeWS() {
		return consumeClient.consumneWS();
	}
	
	
	
	

}
