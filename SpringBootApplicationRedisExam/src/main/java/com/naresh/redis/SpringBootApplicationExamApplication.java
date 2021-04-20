package com.naresh.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootApplicationExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationExamApplication.class, args);
	}

}
