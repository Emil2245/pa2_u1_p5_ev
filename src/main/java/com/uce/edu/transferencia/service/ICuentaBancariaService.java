package com.uce.edu.transferencia.service;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

import java.math.BigDecimal;

public interface ICuentaBancariaService {
    CuentaBancaria buscar(String codigo);
    void guardar (CuentaBancaria materia);
    void actualizar (CuentaBancaria materia);
    void eliminar (String codigo);
    void depositar(String numCta,BigDecimal deposito);
}
