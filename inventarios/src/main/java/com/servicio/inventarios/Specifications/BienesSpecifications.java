package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import java.util.List;

public class BienesSpecifications {

    public static Specification<Bienes> hasInventarioBien(List<String> inventarios) {

        return (root, query, builder) -> {
            var predicados = inventarios.stream().map(inventario -> builder.like(root.get("bien_inventario"),
                    "%" + inventario + "%"
            ))
                    .toArray(Predicate[]::new);
            return builder.or(predicados);
        };
    }
}
