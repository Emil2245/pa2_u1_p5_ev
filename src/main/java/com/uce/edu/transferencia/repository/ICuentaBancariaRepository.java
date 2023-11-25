package com.uce.edu.transferencia.repository;

import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
    //CRUD
    CuentaBancaria seleccionar(String numero);
    void insertar(CuentaBancaria cuentaBancaria);

    void actualizar(CuentaBancaria cuentaBancaria);

    void eliminar(String numero);
}
