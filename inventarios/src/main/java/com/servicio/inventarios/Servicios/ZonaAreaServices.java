package com.servicio.inventarios.Servicios;

import com.servicio.inventarios.Modelos.Zona_Area;
import com.servicio.inventarios.Repositorios.Zona_AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ZonaAreaServices {

    @Autowired
    private Zona_AreaRepository zona_areaRepository;

    public Page<Zona_Area> getAllZonasAreas(int page, int size) {
        Pageable resultados = PageRequest.of(page, size);
        return zona_areaRepository.findAll(resultados);
    }

}
