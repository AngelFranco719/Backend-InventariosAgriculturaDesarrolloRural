package com.servicio.inventarios.Repositiorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.servicio.inventarios.Modelos.Responsable; 

public interface RepresentanteRepository extends JpaRepository<Responsable, Long>{
    
}
