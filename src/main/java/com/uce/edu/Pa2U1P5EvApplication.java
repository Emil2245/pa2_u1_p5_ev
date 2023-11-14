package com.uce.edu;

import com.uce.edu.ioc.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Pa2U1P5EvApplication implements CommandLineRunner {

	@Autowired
	private Estudiante estudiante;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5EvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.estudiante.setNombre("Emil");
		this.estudiante.setApellido("Verkade");
		this.estudiante.setCedula("17");
		this.estudiante.setSalario(new BigDecimal(150));
		System.out.println(estudiante.toString());

	}

	
}
