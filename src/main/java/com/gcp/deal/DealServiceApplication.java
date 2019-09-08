package com.gcp.deal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DealServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealServiceApplication.class, args);
	}
}

@RestController
class DealController {
	@GetMapping("createDeal")
	public void createDeal() {
		System.out.println("Deal Created");
	}
}