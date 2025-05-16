package com.servicio.inventarios.Servicios;

import com.servicio.inventarios.Modelos.Localizacion;
import com.servicio.inventarios.Repositorios.LocalizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LocalizacionServices {

    @Autowired
    LocalizacionRepository localizacionRepository;

    public Page<Localizacion> getAllLocalizaciones(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return localizacionRepository.findAll(pageable);
    }
}
