package com.uce.edu.service;

import com.uce.edu.repository.IMateriaRepository;
import com.uce.edu.repository.modelo.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements IMateriaService {
    @Autowired
    private IMateriaRepository iMateriaRepository;
    @Override
    public Materia buscar(String codigo) {
        return this.iMateriaRepository.seleccionar(codigo);
    }

    @Override
    public void registrar(Materia materia) {
        this.iMateriaRepository.insertar(materia);
    }

    @Override
    public void actualizar(Materia materia) {
        this.iMateriaRepository.actualizar(materia);
    }

    @Override
    public void eliminar(String codigo) {
        this.iMateriaRepository.borrar(codigo);
    }

    @Override
    public List<Materia> listar() {
        return this.iMateriaRepository.listar();
    }

}
