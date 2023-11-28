package com.uce.edu.transferencia.service;

import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CuentaBancariaServiceIpl implements ICuentaBancariaService{
    @Autowired
    private ICuentaBancariaRepository iCuentaBancariaRepository;
    @Override
    public CuentaBancaria buscar(String codigo) {
        return this.iCuentaBancariaRepository.seleccionar(codigo);
    }


    @Override
    public void guardar(CuentaBancaria cuentaBancaria) {
        this.iCuentaBancariaRepository.insertar(cuentaBancaria);

    }

    @Override
    public void actualizar(CuentaBancaria cuentaBancaria) {
        this.iCuentaBancariaRepository.actualizar(cuentaBancaria);

    }

    @Override
    public void eliminar(String codigo) {
        this.iCuentaBancariaRepository.eliminar(codigo);

    }

    @Override
    public void depositar(String numCta, BigDecimal deposito) {
//        6. buscar cuenta destino
        CuentaBancaria ctaDestino = this.iCuentaBancariaRepository.seleccionar(numCta);
//        7. consultar el saldo
        BigDecimal saldoDestino = ctaDestino.getSaldo();
//        8. sumar el monto
        BigDecimal nuevoSaldoDestino = saldoDestino.add(deposito.multiply(new BigDecimal(0.9)));
//        9. actualizar la cuenta destino
        ctaDestino.setSaldo(nuevoSaldoDestino);
        this.iCuentaBancariaRepository.actualizar(ctaDestino);
//
    }

}
