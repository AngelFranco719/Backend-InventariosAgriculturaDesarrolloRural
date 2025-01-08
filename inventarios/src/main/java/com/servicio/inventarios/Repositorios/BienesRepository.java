package com.servicio.inventarios.Repositorios;

import com.servicio.inventarios.Modelos.Bienes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BienesRepository extends JpaRepository<Bienes, Long>, JpaSpecificationExecutor<Bienes> {

}
