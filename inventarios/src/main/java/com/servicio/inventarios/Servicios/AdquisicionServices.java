package com.servicio.inventarios.Servicios;

import com.servicio.inventarios.Modelos.Adquisicion;
import com.servicio.inventarios.Repositorios.AdquisicionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdquisicionServices {

    @Autowired
    private AdquisicionRepository adquisicionRepository;

    public List<Adquisicion> selectAllAdquisiciones() {
        return adquisicionRepository.findAll();
    }

}
