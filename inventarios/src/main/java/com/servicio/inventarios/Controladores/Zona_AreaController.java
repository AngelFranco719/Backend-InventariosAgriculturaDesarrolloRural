package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Zona_Area;
import com.servicio.inventarios.Repositorios.Zona_AreaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ZonasAreas")
public class Zona_AreaController {

    @Autowired
    Zona_AreaRepository zona_areaRepository;

    @GetMapping
    public List<Zona_Area> getAllZonas_Areas() {
        return zona_areaRepository.findAll();
    }

}
