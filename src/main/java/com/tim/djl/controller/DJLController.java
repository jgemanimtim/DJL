package com.tim.djl.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DJLController {

private static final Logger logger  = LogManager.getLogger(DJLController.class);
	
	
	@RequestMapping("/")
	public String home() {
		logger.info("home accessed");
		
		
		
		return " Booteh Home!!!!";
	}
	
}
