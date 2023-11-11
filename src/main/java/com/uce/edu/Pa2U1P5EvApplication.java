package com.uce.edu;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5EvApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5EvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Mundo");
		System.out.println("Soy Emil Verkade");
		LocalDateTime now = LocalDateTime.now();
        System.out.println("Hora actual: " + now);
        System.out.println("Cambio en la rama");
        System.out.println("Taller 4");
        System.out.println("Cambios taller 4");
	}

	
}
