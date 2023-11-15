package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Materia;
import org.springframework.stereotype.Repository;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

    @Override
    public Materia seleccionar(String codigo) {
        return null;
    }

    @Override
    public void insertar(Materia materia) {

    }

    @Override
    public void actualizar(Materia materia) {

    }

    @Override
    public void borrar(String codigo) {

    }
}
