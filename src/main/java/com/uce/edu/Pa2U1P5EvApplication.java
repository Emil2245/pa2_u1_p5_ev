package com.uce.edu;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Numeracion;
import com.uce.edu.transferencia.service.ICuentaBancariaService;
import com.uce.edu.transferencia.service.ITransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Pa2U1P5EvApplication implements CommandLineRunner {
	@Autowired
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private ICuentaBancariaService iCuentaBancariaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5EvApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//1. Crear cuentas
		CuentaBancaria ctaOrigen= new CuentaBancaria();
		ctaOrigen.setCedulaPropietario("132321321");
		ctaOrigen.setSaldo(new BigDecimal(100.01));
		ctaOrigen.setNumero(""+ Numeracion.getNextID());
		this.iCuentaBancariaService.guardar(ctaOrigen);

		CuentaBancaria ctaDestino= new CuentaBancaria();
		ctaDestino.setCedulaPropietario("5598098");
		ctaDestino.setSaldo(new BigDecimal(500.01));
		ctaDestino.setNumero(""+ Numeracion.getNextID());
		this.iCuentaBancariaService.guardar(ctaDestino);

		CuentaBancaria cta3= new CuentaBancaria();
		cta3.setCedulaPropietario("5598098");
		cta3.setSaldo(new BigDecimal(47.01));
		cta3.setNumero(""+ Numeracion.getNextID());
		this.iCuentaBancariaService.guardar(cta3);

//		this.iTransferenciaService.realizar(ctaOrigen.getNumero(),ctaDestino.getNumero(),new BigDecimal(20));
////		System.out.println(ctaDestino);
////		System.out.println(ctaOrigen);
//		CuentaBancaria ctaOrigen1 =this.iCuentaBancariaService.buscar(ctaOrigen.getNumero());
//		CuentaBancaria ctaDestino1 =this.iCuentaBancariaService.buscar(ctaDestino.getNumero());

		System.out.println(ctaOrigen.getNumero());
		System.out.println(ctaDestino.getNumero());
		System.out.println(cta3.getNumero());

	}
}
