package com.bund.north.bund.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BundEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BundEurekaApplication.class, args);
	}

}
