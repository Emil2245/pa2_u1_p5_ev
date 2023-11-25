package com.uce.edu;

import com.uce.edu.repository.modelo.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5EvApplication implements CommandLineRunner {

	@Autowired
	private Materia materia;
	@Autowired
	private Materia materia1;
	@Autowired
	private Materia materia2;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5EvApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		this.materia.setNombre("Avanzada 2");
		System.out.println(this.materia);
		System.out.println(this.materia1);
		this.materia1.setNombre("Redes");
		System.out.println(this.materia1);
		System.out.println(this.materia);

		this.materia2.setNombre("Otra Materia");
		System.out.println(this.materia2);
		System.out.println(this.materia1);
		System.out.println(this.materia);

	}
}
