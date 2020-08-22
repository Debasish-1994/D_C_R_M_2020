package com.dev.magma.dcrm2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication()
public class Dcrm2020Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Dcrm2020Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Dcrm2020Application.class, args);
	}
}
