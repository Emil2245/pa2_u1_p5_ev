package com.uce.edu.logica.de.negocio.service;

import com.uce.edu.logica.de.negocio.repository.modelo.Materia;

import java.util.List;

public interface IMateriaService {
    Materia buscar(String codigo);
    void registrar (Materia materia);
    void actualizar (Materia materia);
    void eliminar (String codigo);
    List<Materia> listar();
}
