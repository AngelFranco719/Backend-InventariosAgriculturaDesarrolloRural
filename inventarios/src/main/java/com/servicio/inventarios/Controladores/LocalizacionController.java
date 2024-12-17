package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Localizacion;
import com.servicio.inventarios.Repositorios.LocalizacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Localizaciones")
public class LocalizacionController {

    @Autowired
    LocalizacionRepository localizacionRepository;

    @GetMapping
    public List<Localizacion> getAllLocalizaciones() {
        return localizacionRepository.findAll();
    }
}
