package com.castelo.dispenca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DispencaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DispencaApplication.class, args);
	}

}