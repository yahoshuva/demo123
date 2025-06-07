package com.eg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo123Application {

	public static Logger logger =  LoggerFactory.getLogger(Demo123Application.class);

	public static void main(String[] args) {
		logger.info("Application start..");
		SpringApplication.run(Demo123Application.class, args);
	}

}
