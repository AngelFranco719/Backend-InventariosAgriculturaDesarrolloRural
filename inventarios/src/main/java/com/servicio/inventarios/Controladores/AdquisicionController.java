package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Adquisicion;
import com.servicio.inventarios.Repositorios.AdquisicionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Adquisiciones")
public class AdquisicionController {

    @Autowired
    private AdquisicionRepository adquisicionRepository;

    @GetMapping
    public List<Adquisicion> getAllAdquisiciones() {
        return adquisicionRepository.findAll();
    }
}
