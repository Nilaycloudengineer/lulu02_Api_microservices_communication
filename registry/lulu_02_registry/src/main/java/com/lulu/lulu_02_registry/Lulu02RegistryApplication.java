package com.lulu.lulu_02_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Lulu02RegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lulu02RegistryApplication.class, args);
	}

}
