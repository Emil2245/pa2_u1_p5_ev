package com.uce.edu.transferencia.repository;

import com.uce.edu.transferencia.repository.modelo.Transferencia;

public interface ITransferenciaRepository {
    //CRUD
    Transferencia seleccionar (String numero);
    void insertar(Transferencia transferencia);
    void actualizar (Transferencia transferencia);
    void eliminar(String numero);
}
