package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Materia;

import java.util.List;

public interface IMateriaRepository {

    Materia seleccionar(String codigo);
    void insertar (Materia materia);
    void actualizar (Materia materia);
    void borrar (String codigo);
    List<Materia> listar();
}
