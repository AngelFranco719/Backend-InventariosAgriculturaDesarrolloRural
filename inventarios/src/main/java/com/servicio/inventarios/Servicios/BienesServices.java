package com.servicio.inventarios.Servicios;

import com.servicio.inventarios.Modelos.Bienes;
import com.servicio.inventarios.Repositorios.BienesRepository;
import com.servicio.inventarios.Specifications.BienesSpecifications;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class BienesServices {

    @Autowired
    private BienesRepository bienRepository;

    public List<Bienes> selectAllBienes() {
        return bienRepository.findAll();
    }

    public List<Bienes> FilterBienesByParameters(Timestamp fecha, String nombre,
            String descripcion) {
        Specification<Bienes> spec = Specification.where(null);

        if (fecha != null) {
            spec = spec.and(BienesSpecifications.hasFechaAdquisicion(fecha));
        }
        if (nombre != null) {
            spec = spec.and(BienesSpecifications.hasNombreResponsable(nombre));
        }
        if (descripcion != null) {
            spec = spec.and(BienesSpecifications.hasDescripcionProducto(descripcion));
        }

        return bienRepository.findAll(spec);

    }

}
