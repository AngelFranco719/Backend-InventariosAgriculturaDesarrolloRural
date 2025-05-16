package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Bienes;
import com.servicio.inventarios.Servicios.BienesServices;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public ResponseEntity<Page<Bienes>> getAllBienes(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Page<Bienes> resultados = bienesServices.selectAllBienes(page, size);
        return ResponseEntity.ok(resultados);
    }

    @GetMapping("/filter")
    public ResponseEntity<Page<Bienes>> getBienesByFilters(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) List<String> inventario,
            @RequestParam(required = false) Date fecha,
            @RequestParam(required = false) List<String> nombre,
            @RequestParam(required = false) List<String> descripcion,
            @RequestParam(required = false) String localizacion,
            @RequestParam(required = false) String area,
            @RequestParam(required = false) List<String> marca
    ) {
        Page<Bienes> resultado = bienesServices.FilterBienesByParameters(page, size, fecha, nombre, descripcion,
                localizacion, marca, inventario, area);
        if (!resultado.isEmpty()) {
            return ResponseEntity.ok(resultado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
