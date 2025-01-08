package com.servicio.inventarios.Servicios;

import com.servicio.inventarios.Modelos.Producto;
import com.servicio.inventarios.Repositorios.ProductoRepository;
import com.servicio.inventarios.Specifications.ProductoSpecifications;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ProductoServices {

    @Autowired
    private ProductoRepository productoRepository;

//    public List<Producto> getSearchRecommendations(
//            String descripcion
//    ) {
//        Specification<Producto> spec = Specification.where(null);
//        if (descripcion != null) {
//            spec = spec.and(ProductoSpecifications.getDescripcionBySearch(descripcion));
//        }
//        return productoRepository.findAll(spec);
//    }

}
