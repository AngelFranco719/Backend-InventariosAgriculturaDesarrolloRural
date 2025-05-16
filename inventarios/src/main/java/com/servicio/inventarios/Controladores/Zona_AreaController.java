package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Zona_Area;
import com.servicio.inventarios.Repositorios.Zona_AreaRepository;
import com.servicio.inventarios.Servicios.ZonaAreaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ZonasAreas")
public class Zona_AreaController {

    @Autowired
    ZonaAreaServices zona_areaServices;

    @GetMapping
    public ResponseEntity<Page<Zona_Area>> getAllZonas_Areas(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Page<Zona_Area> Resultados = zona_areaServices.getAllZonasAreas(page, size); 
        return ResponseEntity.ok(Resultados);
    }

}
