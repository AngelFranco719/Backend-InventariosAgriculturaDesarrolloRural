package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Adquisicion;
import com.servicio.inventarios.Servicios.AdquisicionServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Adquisiciones")
public class AdquisicionController {

    @Autowired
    private AdquisicionServices adquisicionService;

    @GetMapping
    public List<Adquisicion> getAllAdquisiciones() {
        return adquisicionService.selectAllAdquisiciones();
    }
}
