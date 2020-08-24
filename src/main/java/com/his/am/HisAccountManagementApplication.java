package com.his.am;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HisAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisAccountManagementApplication.class, args);
	}

}
