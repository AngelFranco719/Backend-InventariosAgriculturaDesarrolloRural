package com.servicio.inventarios.Repositorios;

import com.servicio.inventarios.Modelos.Bienes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BienesRepository extends JpaRepository<Bienes, Long> {
    
}
