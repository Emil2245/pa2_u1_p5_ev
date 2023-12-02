package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.inventario.repository.modelo.Inventario;

public interface IBodegaService {
    Bodega buscar(String codigo);
    void guardar (Bodega bodega);
    void actualizar (Bodega bodega);
    void eliminar (String codigo);
}
