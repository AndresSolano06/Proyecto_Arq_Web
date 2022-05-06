package com.example.demo;

import com.example.demo.entities.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebGamesApplication {

	public static void main(String[] args) {

		Usuario asd =new Usuario();
		asd.getFirstname();


		SpringApplication.run(WebGamesApplication.class, args);
	}

}
