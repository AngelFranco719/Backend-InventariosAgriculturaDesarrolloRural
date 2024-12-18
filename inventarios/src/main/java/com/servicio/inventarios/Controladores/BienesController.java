package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Bienes;
import com.servicio.inventarios.Servicios.BienesServices;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Bienes")
public class BienesController {

    @Autowired
    private BienesServices bienesServices;

    @GetMapping
    public List<Bienes> getAllBienes() {
        return bienesServices.selectAllBienes();
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Bienes>> getBienesByFilters(
            @RequestParam(required = false) Timestamp fecha,
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String descripcion
    ) {
        List<Bienes> resultado = bienesServices.FilterBienesByParameters(fecha, nombre, descripcion);
        if (!resultado.isEmpty()) {
            return ResponseEntity.ok(resultado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
