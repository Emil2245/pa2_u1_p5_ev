package com.uce.edu.transferencia.repository.modelo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalTime;
@Component
public class Transferencia {
    private String num;
    private LocalTime fecha;
    private BigDecimal monto;
    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;

    @Override
    public String toString() {
        return "Transferencia{" +
                "num='" + num + '\'' +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", cuentaOrigen=" + cuentaOrigen +
                ", cuentaDestino=" + cuentaDestino +
                '}';
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public CuentaBancaria getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaBancaria getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaBancaria cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
}
