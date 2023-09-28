package com.msil.redisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisexampleApplication.class, args);
	}

}
