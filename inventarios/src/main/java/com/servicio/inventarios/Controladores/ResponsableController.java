package com.servicio.inventarios.Controladores;

import com.servicio.inventarios.Modelos.Responsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.servicio.inventarios.Repositorios.ResponsableRepository;
import java.util.List;

@RestController
@RequestMapping("/api/Responsables")
public class ResponsableController {
    @Autowired
    private ResponsableRepository responsableRepository; 
    
    @GetMapping
    public List<Responsable> getAllResponsables(){
        return responsableRepository.findAll();
    }
}
