package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import org.springframework.data.jpa.domain.Specification;

public class BienesSpecifications {

    public static Specification<Bienes> hasInventarioBien(String inventario) {
        return (root, query, builder) -> builder.like(
                root.get("bien_inventario"),
                "%" + inventario + "%");
    }
}
