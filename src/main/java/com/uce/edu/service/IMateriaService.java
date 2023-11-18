package com.uce.edu.service;

import com.uce.edu.repository.modelo.Materia;

import java.util.List;

public interface IMateriaService {
    Materia buscar(String codigo);
    void registrar (Materia materia);
    void actualizar (Materia materia);
    void eliminar (String codigo);
    List<Materia> listar();
}
