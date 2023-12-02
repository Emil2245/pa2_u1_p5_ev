package com.uce.edu;

import com.uce.edu.inventario.repository.modelo.Bodega;
import com.uce.edu.inventario.repository.modelo.Producto;
import com.uce.edu.inventario.service.IBodegaService;
import com.uce.edu.inventario.service.IInventarioService;
import com.uce.edu.inventario.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5EvApplication implements CommandLineRunner {
    //    Inyeccion por atributo
    private final IProductoService iProductoService;
    private final IBodegaService iBodegaService;
    private final IInventarioService iInventarioService;

    @Autowired
    public Pa2U1P5EvApplication(IBodegaService iBodegaService, IProductoService iProductoService, IInventarioService iInventarioService) {
        this.iBodegaService = iBodegaService;
        this.iProductoService = iProductoService;
        this.iInventarioService = iInventarioService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Pa2U1P5EvApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Producto p1 = new Producto();
        p1.setCodigoBarras("12321654");
        p1.setNombre("Hp L1");
        p1.setStock(0);

        Producto p2 = new Producto();
        p2.setCodigoBarras("59846168");
        p2.setNombre("Hp V55");
        p2.setStock(0);

        this.iProductoService.guardar(p1);
        this.iProductoService.guardar(p2);

        Bodega bodega1 = new Bodega();
        bodega1.setDireccion("UCE");
        bodega1.setCodigo("1684621987");
        bodega1.setCapacidad(2998484);
        bodega1.setNombre("Bodega 1");
        this.iBodegaService.guardar(bodega1);

        this.iInventarioService.registrar(
                bodega1.getCodigo(), p1.getCodigoBarras(), 50);
        this.iInventarioService.registrar(
                bodega1.getCodigo(), p2.getCodigoBarras(), 100);
        this.iInventarioService.registrar(
                bodega1.getCodigo(), p1.getCodigoBarras(), 20);
        System.out.println("----------------------");

        System.out.println(
                this.iProductoService.buscar(p1.getCodigoBarras())
        );
        System.out.println(
                this.iProductoService.buscar(p2.getCodigoBarras())
        );
        System.out.println("----------------------");

    }
}
