package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repository.modelo.Producto;

public interface IProductoService {
    Producto buscar(String codigoBarras);
    void guardar (Producto producto);
    void actualizar (Producto producto);
    void eliminar (String codigoBarras);
}
