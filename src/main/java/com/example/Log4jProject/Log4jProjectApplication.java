package com.example.Log4jProject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Log4jProjectApplication {
static Logger log=Logger.getLogger(Log4jProjectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Log4jProjectApplication.class, args);
//		BasicConfigurator.configure();
		PropertyConfigurator.configure("Log4j.properties");
		log.info("Information");
		log.error("Error");
		log.debug("Debugging");
		log.fatal("CriticalError");
		log.warn("Warning");
	}

}
