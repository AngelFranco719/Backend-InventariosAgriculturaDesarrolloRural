package com.servicio.inventarios.Controladores;

import static com.fasterxml.jackson.databind.util.ClassUtil.defaultValue;
import com.servicio.inventarios.Modelos.Producto;
import com.servicio.inventarios.Repositorios.ProductoRepository;
import com.servicio.inventarios.Servicios.ProductoServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Productos")
public class ProductoController {

    @Autowired
    private ProductoServices productoServices;

    @GetMapping
    public ResponseEntity<Page<Producto>> getAllProductos(
            @RequestParam(defaultValue = "0") int page, 
            @RequestParam(defaultValue = "10") int size
    ) {
        Page<Producto> resultados = productoServices.getAllProductos(page, size); 
        return ResponseEntity.ok(resultados); 
    }

//    @GetMapping("/search/Productos")
//    public List<String> getRecommendations(
//            @RequestParam(required = false) String descripcion
//    ) {
//
//    }
}
