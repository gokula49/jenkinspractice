package com.example.dockerandk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Dockerandk8sApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Dockerandk8sApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Dockerandk8sApplication.class);
	}
}
