package com.example.Log4jProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	Logger log=Logger.getLogger(Log4jProjectApplication.class);
	{
		PropertyConfigurator.configure("Log4j.properties");
	}
@GetMapping("/getName")
public String getName() {
	log.info("Getted the name");
	return "Hi Hello";
}
}
