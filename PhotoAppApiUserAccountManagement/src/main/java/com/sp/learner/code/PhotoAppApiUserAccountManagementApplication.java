package com.sp.learner.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class PhotoAppApiUserAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiUserAccountManagementApplication.class, args);
	}

}
