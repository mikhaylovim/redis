package com.example.redis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisApplication {
	private static final Logger logger = LogManager.getLogger(RedisApplication.class);

	public static void main(String[] args) {
		logger.info("Starting...");
		SpringApplication.run(RedisApplication.class, args);
	}

}