package com.empleos.solicitudes.dto;

import lombok.Data;

@Data
public class DocumentoDTO {
    private Integer id;
    private String extension;
    private String nombreArchivo;
    @Data
    public static class SolicitudDTO {
        private Integer id;
    }
    
    private SolicitudDTO solicitud;
}
