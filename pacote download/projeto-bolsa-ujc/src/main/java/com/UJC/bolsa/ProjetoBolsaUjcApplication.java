package com.UJC.bolsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjetoBolsaUjcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoBolsaUjcApplication.class, args);
		
		//System.out.println(new BCryptPasswordEncoder().encode("123000"));
	}

}
