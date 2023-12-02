package com.uce.edu.inventario.service;

import com.uce.edu.inventario.repository.IProductoRepository;
import com.uce.edu.inventario.repository.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements IProductoService{
    @Autowired
    private IProductoRepository iProductoRepository;
    @Override
    public Producto buscar(String codigo) {
        return this.iProductoRepository.seleccionar(codigo);
    }


    @Override
    public void guardar(Producto cuentaBancaria) {
        this.iProductoRepository.insertar(cuentaBancaria);

    }

    @Override
    public void actualizar(Producto cuentaBancaria) {
        this.iProductoRepository.actualizar(cuentaBancaria);

    }

    @Override
    public void eliminar(String codigo) {
        this.iProductoRepository.eliminar(codigo);

    }

}
