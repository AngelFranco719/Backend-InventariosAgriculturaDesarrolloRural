package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import org.springframework.data.jpa.domain.Specification;

public class ProductoSpecifications {

    public static Specification<Bienes> hasDescripcionProducto(String descripcion) {
        return (root, query, builder) -> builder.like(builder.lower(
                root.get("bien_prod").get("prod_descripcion")),
                "%" + descripcion + "%"
        );
    }

    public static Specification<Bienes> hasMarcaProducto(String producto) {
        return (root, query, builder) -> builder.like(builder.lower(
                root.get("bien_prod").get("prod_marca")
        ), "%" + producto + "%");
    }

}
