package com.uce.edu;

import com.uce.edu.ioc.Estudiante;
import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class Pa2U1P5EvApplication implements CommandLineRunner {

	@Autowired
	private IMateriaService iMateriaService;
	@Autowired
	private Materia materia;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5EvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.materia.setCodigo("P1");
		this.materia.setNombre("Avanzada 2");
		this.materia.setNumeroCreditos(17);
		this.iMateriaService.registrar(materia);

		this.iMateriaService.buscar("P1");

		Materia materia1= this.iMateriaService.buscar("P1");
		System.out.println(materia1);

		materia1.setNumeroCreditos(50);

		this.iMateriaService.actualizar(materia1);
		materia1=this.iMateriaService.buscar("P1");
		System.out.println(materia1);

		//this.iMateriaService.eliminar("P1");

		Materia materia2=this.iMateriaService.buscar("P1");
		System.out.println(materia2);

		List<Materia> busqueda=this.iMateriaService.listar();
		busqueda.forEach(System.out::println);
	}

	
}
