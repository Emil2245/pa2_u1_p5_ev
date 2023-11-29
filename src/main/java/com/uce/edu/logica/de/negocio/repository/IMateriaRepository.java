package com.uce.edu.logica.de.negocio.repository;

import com.uce.edu.logica.de.negocio.repository.modelo.Materia;

import java.util.List;

public interface IMateriaRepository {

    Materia seleccionar(String codigo);
    void insertar (Materia materia);
    void actualizar (Materia materia);
    void borrar (String codigo);
    List<Materia> listar();
}
