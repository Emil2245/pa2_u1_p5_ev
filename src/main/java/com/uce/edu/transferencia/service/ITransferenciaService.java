package com.uce.edu.transferencia.service;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.transferencia.repository.modelo.Transferencia;

import java.math.BigDecimal;

public interface ITransferenciaService {
    Transferencia buscar(String codigo);
    void guardar (Transferencia materia);
    void actualizar (Transferencia materia);
    void eliminar (String codigo);
    void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto);
}
