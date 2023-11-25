package com.uce.edu.transferencia.service;

import com.uce.edu.repository.IMateriaRepository;
import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.ITransferenciaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{
    @Autowired
    private ITransferenciaRepository iTransferenciaRepository;
    @Autowired
    private ICuentaBancariaRepository iCuentaBancariaRepository;
    @Override
    public Transferencia buscar(String codigo) {
        return this.iTransferenciaRepository.seleccionar(codigo);
    }

    @Override
    public void guardar(Transferencia transferencia) {
        this.iTransferenciaRepository.insertar(transferencia);
    }

    @Override
    public void actualizar(Transferencia transferencia) {
        this.iTransferenciaRepository.actualizar(transferencia);
    }

    @Override
    public void eliminar(String codigo) {
        this.iTransferenciaRepository.eliminar(codigo);

    }

    @Override
    public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
//        1. verificar la cuenta origen
        CuentaBancaria cuentaOrigen= this.iCuentaBancariaRepository.seleccionar(numeroOrigen);

//        2. consultar el saldo
//        3. validar el saldo
//        4. restar el monto a transaccionar
//        5. actualizar el nuevo monto

//        6. buscar cuenta destino
//        7. consultar el saldo
//        8. sumar el monto
//        9. actualizar la cuenta destino
//        10. crear la transferencia
    }
}
