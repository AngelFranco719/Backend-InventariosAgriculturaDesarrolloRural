package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Producto;
import com.servicio.inventarios.Repositorios.ProductoRepository;
import com.servicio.inventarios.Servicios.ProductoServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

//    @GetMapping("/search/Productos")
//    public List<String> getRecommendations(
//            @RequestParam(required = false) String descripcion
//    ) {
//
//    }
}
