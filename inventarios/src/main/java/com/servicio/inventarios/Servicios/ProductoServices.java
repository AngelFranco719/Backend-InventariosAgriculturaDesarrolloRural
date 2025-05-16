package com.servicio.inventarios.Servicios;

import com.servicio.inventarios.Modelos.Producto;
import com.servicio.inventarios.Repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductoServices {

    @Autowired
    private ProductoRepository productoRepository;

    public Page<Producto> getAllProductos(int page, int size){
       Pageable pageable = PageRequest.of(page, size); 
       return productoRepository.findAll(pageable); 
    }
    
    
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
