package com.servicio.inventarios.Repositorios;

import com.servicio.inventarios.Modelos.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

//    @Query("SELECT prod_descripcion FROM Producto where prod_descripcion like (% :descripcion %)")
//    public List<String> findDescripcionBySearch(@Param("descripcion") String descripcion);
}
