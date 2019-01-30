package com.akhilesh.springeurekaclientschoolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaClientSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientSchoolServiceApplication.class, args);
	}
}
