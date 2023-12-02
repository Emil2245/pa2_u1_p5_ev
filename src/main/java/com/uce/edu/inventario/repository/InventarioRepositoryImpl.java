package com.uce.edu.inventario.repository;

import com.uce.edu.inventario.repository.modelo.Inventario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{
    private static List<Inventario> bd=new ArrayList<>();
    @Override
    public Inventario seleccionar(String codigo) {
        for (Inventario m: bd) {
            if (m.getCodigo().equals(codigo)) {
                Inventario invetario= new Inventario();
                invetario.setCodigo(m.getCodigo());
                invetario.setFechaIngreso(m.getFechaIngreso());
                invetario.setBodega(m.getBodega());
                invetario.setProducto(m.getProducto());
                return invetario;
            }
        }
        return null;
    }
    public Inventario seleccionarEliminar(String codigo) {
        System.out.println("Seleccionamos: " + codigo);
        for (Inventario m:bd) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void insertar(Inventario codigo) {
        bd.add(codigo);
        System.out.println("Se ha insertado: "+ codigo );

    }

    @Override
    public void actualizar(Inventario inventario) {
        this.eliminar(inventario.getCodigo());
        this.insertar(inventario);
        System.out.println("Se ha actualizado: " +
                inventario);
    }

    @Override
    public void eliminar(String codigo) {
        Inventario m= this.seleccionarEliminar(codigo);
        bd.remove(m);
        System.out.println("Se ha borrado: " + codigo);

    }
}
