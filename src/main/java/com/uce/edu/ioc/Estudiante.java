package com.uce.edu.ioc;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class Estudiante {
    private String Cedula;//al no ser un valor con el que vamos a calcular, no debe ser Integer
    private String nombre;
    private String apellido;
    private BigDecimal salario;//BigDecimal para valores de interes (valor monetario, iva)

    @Override
    public String toString() {
        return "Estudiante{" +
                "Cedula='" + Cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
