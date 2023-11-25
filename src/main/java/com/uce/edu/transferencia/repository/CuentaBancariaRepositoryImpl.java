package com.uce.edu.transferencia.repository;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {
    private static List<CuentaBancaria> bd=new ArrayList<>();

    @Override
    public CuentaBancaria seleccionar(String numero) {
        System.out.println("Seleccionamos: " + numero);
        for (CuentaBancaria m:
                bd) {
            if (m.getNumero().equals(numero)) return m;
        }
        return null;
    }

    @Override
    public void insertar(CuentaBancaria cuentaBancaria) {
        bd.add(cuentaBancaria);
        System.out.println("Se ha insertado: "+ cuentaBancaria );

    }

    @Override
    public void actualizar(CuentaBancaria cuentaBancaria) {
        this.eliminar(cuentaBancaria.getNumero());
        this.insertar(cuentaBancaria);
        System.out.println("Se ha actualizado: " +
                cuentaBancaria);
    }

    @Override
    public void eliminar(String numero) {
        CuentaBancaria m= this.seleccionar(numero);
        bd.remove(m);
        System.out.println("Se ha borrado: " + numero);

    }
}
