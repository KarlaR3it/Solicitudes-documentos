package com.empleos.solicitudes.repository;

import com.empleos.solicitudes.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento, Integer> {
}
