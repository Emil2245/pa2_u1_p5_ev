package com.uce.edu.inventario.repository.modelo;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Producto {
    private LocalDateTime fechaIngreso;
    private Bodega bodega;
    private Producto producto;

    @Override
    public String toString() {
        return "Producto{" +
                "fechaIngreso=" + fechaIngreso +
                ", bodega=" + bodega +
                ", producto=" + producto +
                '}';
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
