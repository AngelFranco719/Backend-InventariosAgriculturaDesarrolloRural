package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import jakarta.persistence.criteria.Predicate;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;

public class ResponsableSpecifications {

    public static Specification<Bienes> hasNombreResponsable(List<String> nombres) {
        return (root, query, builder) -> {
            var predicados = nombres.stream().map(nombre -> builder.like(
                    builder.lower(root.get("bien_resp").get("res_nombre")),
                    "%" + nombre.toLowerCase() + "%"
            ))
            .toArray(Predicate[]::new); 
            return builder.or(predicados); 
        };
    }

}
