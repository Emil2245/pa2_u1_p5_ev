package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Bodega;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BodegaRepositoryImpl implements IBodegaRepository{
    private static List<Bodega> bd=new ArrayList<>();

    @Override
    public Bodega seleccionar(String codigo) {
        for (Bodega m: bd) {
            if (m.getCodigo().equals(codigo)) {
                Bodega bod= new Bodega();
                bod.setCodigo(m.getCodigo());
                bod.setNombre(m.getNombre());
                bod.setCapacidad(m.getCapacidad());
                bod.setDireccion(m.getDireccion());
                return bod;
            }
        }
        return null;
    }
    public Bodega seleccionarEliminar(String codigo) {
        System.out.println("Seleccionamos: " + codigo);
        for (Bodega m:bd) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void insertar(Bodega bodega) {
        bd.add(bodega);
        System.out.println("Se ha insertado: "+ bodega );

    }

    @Override
    public void actualizar(Bodega bodega) {
        this.eliminar(bodega.getCodigo());
        this.insertar(bodega);
        System.out.println("Se ha actualizado: " +
                bodega);
    }

    @Override
    public void eliminar(String codigo) {
        Bodega m= this.seleccionarEliminar(codigo);
        bd.remove(m);
        System.out.println("Se ha borrado: " + codigo);

    }
}
