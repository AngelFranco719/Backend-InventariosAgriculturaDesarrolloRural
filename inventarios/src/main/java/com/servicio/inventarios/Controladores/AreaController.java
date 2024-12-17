package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Area;
import com.servicio.inventarios.Repositorios.AreaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Areas")
public class AreaController {

    @Autowired
    AreaRepository areaRepository;

    @GetMapping
    public List<Area> getAllAreas() {
        return areaRepository.findAll();
    }

}
