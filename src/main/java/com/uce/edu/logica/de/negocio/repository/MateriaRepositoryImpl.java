package com.uce.edu.logica.de.negocio.repository;

import com.uce.edu.logica.de.negocio.repository.modelo.Materia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {
    private static List<Materia> bd=new ArrayList<>();

    @Override
    public Materia seleccionar(String codigo) {
        System.out.println("Seleccionamos: " + codigo);
        for (Materia m:
                bd) {
            if (m.getCodigo().equals(codigo)) return m;
        }
        return null;
    }

    @Override
    public void insertar(Materia materia) {
        bd.add(materia);
        System.out.println("Se ha insertado: "+ materia );

    }

    @Override
    public void actualizar(Materia materia) {
        this.borrar(materia.getCodigo());
        this.insertar(materia);
        System.out.println("Se ha actualizado: " + materia);
    }

    @Override
    public void borrar(String codigo) {
        Materia m= this.seleccionar(codigo);
        bd.remove(m);
        System.out.println("Se ha borrado: " + codigo);

    }

    @Override
    public List<Materia> listar() {
        return bd;
    }
}
