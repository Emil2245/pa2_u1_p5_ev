package com.uce.edu.transferencia.service;

import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalTime;

@Service
public class CuentaBancariaServiceIpl implements ICuentaBancariaService {
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
        //1. verificar la cuenta origen
        CuentaBancaria cuentaOrigen = this.iCuentaBancariaRepository.seleccionar(numCta);
//        2. consultar el saldo
        BigDecimal saldoOrigen = cuentaOrigen.getSaldo();
//        4. restar el monto a transaccionar
        BigDecimal nuevoSaldoOrigen = saldoOrigen.add(deposito.multiply(new BigDecimal(0.9)));
//        5. actualizar el nuevo monto
        cuentaOrigen.setSaldo(nuevoSaldoOrigen);
        this.iCuentaBancariaRepository.actualizar(cuentaOrigen);
    }

}
