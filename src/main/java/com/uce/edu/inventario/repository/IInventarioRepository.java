package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Inventario;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

public interface IInventarioRepository {
    Inventario seleccionar(String codigo);
    void insertar(Inventario inventario);

    void actualizar(Inventario inventario);

    void eliminar(String codigo);
}
