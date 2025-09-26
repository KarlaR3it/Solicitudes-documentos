package com.empleos.solicitudes.repository;

import com.empleos.solicitudes.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {
}
