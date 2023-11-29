package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

public interface IBodegaRepository {
    Bodega seleccionar(String codigo);
    void insertar(Bodega bodega);

    void actualizar(Bodega bodega);

    void eliminar(String codigo);
}
