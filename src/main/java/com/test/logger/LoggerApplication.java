package com.test.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Inderjit SS
 * @since March 2021
 * Demo to Print an Environment variable value to console. 
 *
 */
@SpringBootApplication
@RestController()
@Slf4j
public class LoggerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);
	}

	@Autowired
	private Environment env;

	@GetMapping(value = "/sayHello")
	public String process() {
		log.info("Hello World {}", env.getProperty("env-var1"));
		String s= env.getProperty("env-var1");
		String s1= "Hello World !!!. " + (s==null ?"Please set env-var1:" : "Received environment variable env-var1. value :->")+env.getProperty("VERSION") ;
		return s1;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Java Home Environment Variable found {}", env.getProperty("JAVA_HOME"));		
	}

}
