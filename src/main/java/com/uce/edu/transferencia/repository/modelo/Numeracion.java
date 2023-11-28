package com.uce.edu.transferencia.repository.modelo;

import java.util.concurrent.atomic.AtomicInteger;

public class Numeracion {
    private static final AtomicInteger numeracion= new AtomicInteger(0);
    public static int getNextID(){
        return numeracion.getAndIncrement();
    }
}
