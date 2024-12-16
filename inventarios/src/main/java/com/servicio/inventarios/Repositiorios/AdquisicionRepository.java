package com.servicio.inventarios.Repositiorios;

import com.servicio.inventarios.Modelos.Adquisicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdquisicionRepository extends JpaRepository<Adquisicion, Long> {
}
