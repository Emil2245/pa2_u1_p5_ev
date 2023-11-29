package com.uce.edu;

import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import com.uce.edu.transferencia.service.ICuentaBancariaService;
import com.uce.edu.transferencia.service.ITransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class Pa2U1P5EvApplication implements CommandLineRunner {
//    Inyeccion por atributo
    private final ICuentaBancariaService iCuentaBancariaService;
    private final ITransferenciaService iTransferenciaService;
    @Autowired
    public Pa2U1P5EvApplication(ITransferenciaService iTransferenciaService, ICuentaBancariaService iCuentaBancariaService) {
        this.iTransferenciaService = iTransferenciaService;
        this.iCuentaBancariaService = iCuentaBancariaService;
    }

//    Inyeccion por constructor
//    private ITransferenciaService iTransferenciaService;
//    @Autowired
//    public Pa2U1P5EvApplication(ITransferenciaService iTransferenciaService){
//        this.iTransferenciaService = iTransferenciaService;
//    }

    //inyeccion por metodo
//    private ITransferenciaService iTransferenciaService;
//    @Autowired
//    public void setiTransferenciaService(ITransferenciaService iTransferenciaService) {
//        this.iTransferenciaService = iTransferenciaService;
//    }





    public static void main(String[] args) {
        SpringApplication.run(Pa2U1P5EvApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //1. Crear cuentas
        CuentaBancaria ctaOrigen = new CuentaBancaria();
        ctaOrigen.setCedulaPropietario("132321321");
        ctaOrigen.setSaldo(new BigDecimal(100.01));
        ctaOrigen.setNumero("10");
        this.iCuentaBancariaService.guardar(ctaOrigen);

        CuentaBancaria ctaDestino = new CuentaBancaria();
        ctaDestino.setCedulaPropietario("5598098");
        ctaDestino.setSaldo(new BigDecimal(500.01));
        ctaDestino.setNumero("15");

        this.iCuentaBancariaService.guardar(ctaDestino);

        this.iTransferenciaService.realizar(ctaOrigen.getNumero(), ctaDestino.getNumero(), new BigDecimal(20));
        System.out.println(
                this.iCuentaBancariaService.buscar(ctaOrigen.getNumero()).toString() + "\n" +
                        this.iCuentaBancariaService.buscar(ctaDestino.getNumero()).toString()
        );

        this.iTransferenciaService.realizar(ctaOrigen.getNumero(), ctaDestino.getNumero(), new BigDecimal(50));
        this.iTransferenciaService.realizar(ctaOrigen.getNumero(), ctaDestino.getNumero(), new BigDecimal(5));

        List<Transferencia> listaTransferencias = this.iTransferenciaService.listar();
        int indice = 0;
        System.out.println("Reporte de Cuenta: \n");
        for (Transferencia transferencia :
                listaTransferencias) {
            System.out.println(indice++ + "	: " + transferencia.getMonto() + " - " + transferencia.getCuentaDestino().getCedulaPropietario());

        }


        System.out.println(
                this.iCuentaBancariaService.buscar(ctaOrigen.getNumero()).toString() + "\n" +
                        this.iCuentaBancariaService.buscar(ctaDestino.getNumero()).toString()
        );
        System.out.println("-----------------------------------");

        this.iCuentaBancariaService.depositar("10",new BigDecimal(250));
        System.out.println("-----------------------------------");
        System.out.println(
                this.iCuentaBancariaService.buscar(ctaOrigen.getNumero()));
    }
}
