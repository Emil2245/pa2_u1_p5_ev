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

}
