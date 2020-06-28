package com.backend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;



@SpringBootApplication
public class EnsaBackApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EnsaBackApplication.class, args);
	}

}
