package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import jakarta.persistence.criteria.Predicate;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;

public class ProductoSpecifications {

    public static Specification<Bienes> hasDescripcionProducto(List<String> descripcion) {
        return (root, query, builder) -> {
            var predicados = descripcion.stream().map(desc -> builder.like(
                    builder.lower(root.get("bien_prod").get("prod_descripcion")),
                    "%" + desc.toLowerCase() + "%"
            ))
            .toArray(Predicate[]::new); 
            return builder.or(predicados); 
        };
    }

    public static Specification<Bienes> hasMarcaProducto(List<String> productos) {
        return (root, query, builder) -> {
            var predicados = productos.stream().map(prod -> builder.like(
                    builder.lower(root.get("bien_prod").get("prod_marca")),
                    "%" + prod.toLowerCase() + "%"
            ))
            .toArray(Predicate[]::new); 
            return builder.or(predicados); 
        };
    }

}
