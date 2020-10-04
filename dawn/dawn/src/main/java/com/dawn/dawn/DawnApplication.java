package com.dawn.dawn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.dawn.dawn.controllers")
@EntityScan("com.dawn.dawn.model")
@EnableJpaRepositories("com.dawn.dawn.repository")
@SpringBootApplication
public class DawnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DawnApplication.class, args);
	}

}
