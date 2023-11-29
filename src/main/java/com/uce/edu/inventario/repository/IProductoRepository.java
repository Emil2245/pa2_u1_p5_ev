package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Producto;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

public interface IProductoRepository {
    Producto seleccionar(String codigoBarras);
    void insertar(Producto producto);

    void actualizar(Producto producto);

    void eliminar(String codigoBarras);
}
