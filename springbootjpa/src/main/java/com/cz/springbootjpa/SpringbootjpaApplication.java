package com.cz.springbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.cz.controller","com.cz.service"})
@SpringBootApplication
@EnableJpaRepositories("com.cz.dao")
@EnableAutoConfiguration
@EntityScan("com")
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaApplication.class, args);
	}
}
