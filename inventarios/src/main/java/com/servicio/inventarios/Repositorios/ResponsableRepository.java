package com.servicio.inventarios.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.servicio.inventarios.Modelos.Responsable; 

public interface ResponsableRepository extends JpaRepository<Responsable, Long>{
    
}
