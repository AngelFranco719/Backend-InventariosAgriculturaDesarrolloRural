package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import org.springframework.data.jpa.domain.Specification;

public class AreaSpecifications {

    public static Specification<Bienes> hasUnidadPresupuestal(String unidadPresupuestal) {
        return (root, query, builder) -> builder.equal(
                root.get("bien_zonaArea").
                        get("area").
                        get("are_unidadPresupuestal"),
                unidadPresupuestal);
    }

}
