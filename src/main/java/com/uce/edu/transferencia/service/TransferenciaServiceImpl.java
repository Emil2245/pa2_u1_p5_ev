package com.uce.edu.transferencia.service;

import com.uce.edu.repository.IMateriaRepository;
import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.ITransferenciaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.List;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
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
        CuentaBancaria cuentaOrigen = this.iCuentaBancariaRepository.seleccionar(numeroOrigen);
//        2. consultar el saldo
        BigDecimal saldoOrigen = cuentaOrigen.getSaldo();
//        3. validar el saldo
        if (saldoOrigen.compareTo(monto) >= 0) {

            //todo consultar que hace el metodo .compareTo()
//        4. restar el monto a transaccionar
            BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
//        5. actualizar el nuevo monto
            cuentaOrigen.setSaldo(nuevoSaldoOrigen);
            this.iCuentaBancariaRepository.actualizar(cuentaOrigen);
//        6. buscar cuenta destino
            CuentaBancaria ctaDestino = this.iCuentaBancariaRepository.seleccionar(numeroDestino);
//        7. consultar el saldo
            BigDecimal saldoDestino = ctaDestino.getSaldo();
//        8. sumar el monto
            BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
//        9. actualizar la cuenta destino
            ctaDestino.setSaldo(nuevoSaldoDestino);
            this.iCuentaBancariaRepository.actualizar(ctaDestino);
//        10. crear la transferencia
            Transferencia transferencia = new Transferencia();
            transferencia.setCuentaOrigen(cuentaOrigen);
            transferencia.setCuentaDestino(ctaDestino);
            transferencia.setFecha(LocalTime.now());
            transferencia.setMonto(monto);
            transferencia.setNum("13212312321325");
            //todo investigar una forma de crear los id's para que sean unicos

            this.iTransferenciaRepository.insertar(transferencia);
            System.out.println("Transferencia Exitosa");
        } else {
            System.out.println("Saldo no disponible");
        }
    }

    @Override
    public List<Transferencia> listar() {
        return this.iTransferenciaRepository.listar();
    }
}
