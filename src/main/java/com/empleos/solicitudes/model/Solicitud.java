package com.empleos.solicitudes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "solicitudes")

@Getter
@Setter
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String estado;
    private String area;
    private String pais;
    private String localizacion;
    private Integer numVacantes;
    private String descripcion;
    private String baseEduc;
    private String conocimExcluyente;
    private Integer rentaDesde;
    private Integer rentaHasta;
    private String modTrabajo;
    private String tipoServicio;
    private String nivelExperien;
    private LocalDate fechaIniProyecto;
    private Integer usuarioId;
    
    @OneToMany(mappedBy = "solicitud", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Documento> documentos;
}
