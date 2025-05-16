package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Responsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.servicio.inventarios.Servicios.ResponsableServices;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/Responsables")
public class ResponsableController {

    @Autowired
    private ResponsableServices responsableServices;

    @GetMapping
    public ResponseEntity<Page<Responsable>> getAllResponsables(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Page<Responsable> resultados = responsableServices.getAllResponsables(page, size);
        return ResponseEntity.ok(resultados);
    }
}
