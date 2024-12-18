package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import org.springframework.data.jpa.domain.Specification;

public class LocalizacionSpecifications {

    public static Specification<Bienes> hasLocalizacionZona(String localizacion) {
        return (root, query, builder) -> builder.like(builder.lower(
                root.get("bien_zonaArea").
                        get("zona").
                        get("zon_loc").
                        get("loc_domicilio")
        ),
                "%" + localizacion + "%"
        );
    }
}
