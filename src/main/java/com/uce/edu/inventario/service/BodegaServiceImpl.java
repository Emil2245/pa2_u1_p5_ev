package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repository.IBodegaRepository;
import com.uce.edu.inventario.repository.modelo.Bodega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BodegaServiceImpl implements IBodegaService{
    @Autowired
    private IBodegaRepository iBodegaRepository;

    @Override
    public Bodega buscar(String codigo) {
        return this.iBodegaRepository.seleccionar(codigo);
    }


    @Override
    public void guardar(Bodega cuentaBancaria) {
        this.iBodegaRepository.insertar(cuentaBancaria);

    }

    @Override
    public void actualizar(Bodega cuentaBancaria) {
        this.iBodegaRepository.actualizar(cuentaBancaria);

    }

    @Override
    public void eliminar(String codigo) {
        this.iBodegaRepository.eliminar(codigo);

    }

}
