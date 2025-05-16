package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Localizacion;
import com.servicio.inventarios.Repositorios.LocalizacionRepository;
import com.servicio.inventarios.Servicios.LocalizacionServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Localizaciones")
public class LocalizacionController {

    @Autowired
    LocalizacionServices localizacionServices;

    @GetMapping
    public ResponseEntity<Page<Localizacion>> getAllLocalizaciones(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Page<Localizacion> Resultados = localizacionServices.getAllLocalizaciones(page, size);
        return ResponseEntity.ok(Resultados);
    }
}
