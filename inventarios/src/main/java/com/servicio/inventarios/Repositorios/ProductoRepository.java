package com.servicio.inventarios.Repositorios;

import com.servicio.inventarios.Modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
