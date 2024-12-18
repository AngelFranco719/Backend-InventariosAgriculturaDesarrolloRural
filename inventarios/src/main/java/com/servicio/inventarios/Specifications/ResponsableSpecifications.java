package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import org.springframework.data.jpa.domain.Specification;

public class ResponsableSpecifications {

    public static Specification<Bienes> hasNombreResponsable(String nombre) {
        return (root, query, builder) -> builder.like(builder.lower(
                root.get("bien_resp")
                        .get("res_nombre")
        ), "%" + nombre.toLowerCase() + "%");
    }

}
