package com.empleos.solicitudes.dto;

import lombok.Data;

@Data
public class DocumentoDTO {
    private Integer id;
    private String extension;
    private String nombreArchivo;
    private Integer solicitudId;
}
