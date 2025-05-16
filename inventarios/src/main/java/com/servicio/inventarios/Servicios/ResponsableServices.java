package com.servicio.inventarios.Servicios;

import com.servicio.inventarios.Modelos.Responsable;
import com.servicio.inventarios.Repositorios.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ResponsableServices {
    @Autowired
    ResponsableRepository responsableRepository; 
    
    public Page<Responsable> getAllResponsables(int page, int size){
        Pageable pageable = PageRequest.of(page, size); 
        return responsableRepository.findAll(pageable); 
    }
}
