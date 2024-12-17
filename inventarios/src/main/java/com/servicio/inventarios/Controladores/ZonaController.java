package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Zona;
import com.servicio.inventarios.Repositorios.ZonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Zonas")
public class ZonaController {

    @Autowired
    ZonaRepository zonaRepository;

    @GetMapping
    public List<Zona> getAllZonas() {
        return zonaRepository.findAll();
    }
}
