package com.uce.edu.transferencia.service;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
    CuentaBancaria buscar(String codigo);
    void guardar (CuentaBancaria materia);
    void actualizar (CuentaBancaria materia);
    void eliminar (String codigo);
}
