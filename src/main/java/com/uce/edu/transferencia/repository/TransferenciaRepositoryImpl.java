package com.uce.edu.transferencia.repository;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.transferencia.repository.ITransferenciaRepository;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {
    private static List<Transferencia> bd= new ArrayList<>();

    @Override
    public Transferencia seleccionar(String numero) {
        System.out.println("Seleccionamos: " + numero);
        for (Transferencia b:
                bd) {
            if (b.getNum().equals(numero)) return b;
        }
        return null;
    }

    @Override
    public void insertar(Transferencia transferencia) {
        bd.add(transferencia);
        System.out.println("Se ha insertado: "+ transferencia );

    }

    @Override
    public void actualizar(Transferencia transferencia) {
        this.eliminar(transferencia.getNum());
        this.insertar(transferencia);
        System.out.println("Se ha actualizado: " +
                transferencia);
    }

    @Override
    public void eliminar(String numero) {
        Transferencia b= this.seleccionar(numero);
        bd.remove(b);
        System.out.println("Se ha borrado: " + numero);
    }
}
