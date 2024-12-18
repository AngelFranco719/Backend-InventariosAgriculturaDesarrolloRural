package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import java.sql.Timestamp;
import org.springframework.data.jpa.domain.Specification;

public class BienesSpecifications {

    public static Specification<Bienes> hasFechaAdquisicion(Timestamp date) {
        return (root, query, builder) -> builder.equal(root.get("bien_adq").get("adq_fecha"), date);
    }

    public static Specification<Bienes> hasNombreResponsable(String nombre) {
        return (root, query, builder) -> builder.like(builder.lower(root.get("bien_resp").get("res_nombre")), "%" + nombre.toLowerCase() + "%");
    }

    public static Specification<Bienes> hasDescripcionProducto(String descripcion) {
        return (root, query, builder) -> builder.like(builder.lower(root.get("bien_prod").get("prod_descripcion")), "%" + descripcion.toLowerCase() + "%");
    }

}
