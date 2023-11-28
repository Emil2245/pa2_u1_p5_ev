package com.uce.edu.transferencia.repository;

import com.uce.edu.transferencia.repository.modelo.Transferencia;

import java.util.List;

public interface ITransferenciaRepository {
    //CRUD
    Transferencia seleccionar (String numero);
    void insertar(Transferencia transferencia);
    void actualizar (Transferencia transferencia);
    void eliminar(String numero);
    public List<Transferencia> listar();
}
