package com.empleos.solicitudes.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SolicitudDTO {
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

}
