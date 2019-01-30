package com.akhilesh.springeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/*
http://localhost:8761
http://localhost:8098/getStudentDetailsForSchool/abcschool
http://localhost:9098//getSchoolDetails/abcschool
*/

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringEurekaServerApplication.class, args);
	}
}
