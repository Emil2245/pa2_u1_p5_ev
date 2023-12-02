package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repository.modelo.Inventario;

import java.math.BigDecimal;

public interface IInventarioService {
    Inventario buscar(String codigo);
    void guardar (Inventario inventario);
    void actualizar (Inventario inventario);
    void eliminar (String codigo);
    void registrar(String codigoBodega, String codigoBarras, Integer stock);

}
