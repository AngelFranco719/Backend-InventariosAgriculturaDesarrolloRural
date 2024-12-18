package com.servicio.inventarios.Specifications;

import com.servicio.inventarios.Modelos.Bienes;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.springframework.data.jpa.domain.Specification;

public class AdquisicionSpecifications {

    public static Specification<Bienes> hasFechaAdquisicion(Date fecha) {
        String formato = new SimpleDateFormat("yyyy-MM-dd").format(fecha);
        return (root, query, builder) -> builder.like(builder.function("DATE_FORMAT", String.class,
                root.get("bien_adq").get("adq_fecha"), builder.literal("%Y-%m-%d")), formato);
    }
}
