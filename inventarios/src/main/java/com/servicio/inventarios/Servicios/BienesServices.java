package com.servicio.inventarios.Servicios;

import com.servicio.inventarios.Specifications.ResponsableSpecifications;
import com.servicio.inventarios.Modelos.Bienes;
import com.servicio.inventarios.Repositorios.BienesRepository;
import com.servicio.inventarios.Specifications.AdquisicionSpecifications;
import com.servicio.inventarios.Specifications.AreaSpecifications;
import com.servicio.inventarios.Specifications.BienesSpecifications;
import com.servicio.inventarios.Specifications.LocalizacionSpecifications;
import com.servicio.inventarios.Specifications.ProductoSpecifications;
import java.sql.Date;
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

    public List<Bienes> FilterBienesByParameters(Date fecha, String nombre,
            String descripcion, String localizacion, String marca,
            String inventario, String area) {
        Specification<Bienes> spec = Specification.where(null);

        if (fecha != null) {
            spec = spec.and(AdquisicionSpecifications.hasFechaAdquisicion(fecha));
        }
        if (nombre != null) {
            spec = spec.and(ResponsableSpecifications.hasNombreResponsable(nombre));
        }
        if (descripcion != null) {
            spec = spec.and(ProductoSpecifications.hasDescripcionProducto(descripcion));
        }
        if (localizacion != null) {
            spec = spec.and(LocalizacionSpecifications.hasLocalizacionZona(localizacion));
        }
        if (marca != null) {
            spec = spec.and(ProductoSpecifications.hasMarcaProducto(marca));
        }
        if (inventario != null) {
            spec = spec.and(BienesSpecifications.hasInventarioBien(inventario));
        }
        if (area != null) {
            spec = spec.and(AreaSpecifications.hasUnidadPresupuestal(area));
        }

        return bienRepository.findAll(spec);

    }

}
