package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Bienes;
import com.servicio.inventarios.Repositorios.BienesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Bienes")
public class BienesController {

    @Autowired
    private BienesRepository bienesRepository;

    @GetMapping
    public List<Bienes> getAllBienes() {
        return bienesRepository.findAll();
    }
}
