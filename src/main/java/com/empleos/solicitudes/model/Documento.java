package com.empleos.solicitudes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "documentos")

@Getter
@Setter
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String extension;
    private String nombreArchivo;
    
    @Column(name = "solicitud_id")
    private Integer solicitudId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "solicitud_id", insertable = false, updatable = false)
    private Solicitud solicitud;
}
