package com.uce.edu.transferencia.repository;

import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {
    private static List<CuentaBancaria> bd=new ArrayList<>();

    @Override
    public CuentaBancaria seleccionar(String numero) {
        for (CuentaBancaria m:
                bd) {
            if (m.getNumero().equals(numero)) {
                CuentaBancaria cta= new CuentaBancaria();
                cta.setNumero(m.getNumero());
                cta.setSaldo(m.getSaldo());
                cta.setCedulaPropietario(m.getCedulaPropietario());
                return cta;
            }
        }
        return null;
    }
    public CuentaBancaria seleccionarEliminar(String numero) {
        System.out.println("Seleccionamos: " + numero);
        for (CuentaBancaria m:bd) {
            if (m.getNumero().equals(numero)) {
                return m;
            }
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
        CuentaBancaria m= this.seleccionarEliminar(numero);
        bd.remove(m);
        System.out.println("Se ha borrado: " + numero);

    }
}
