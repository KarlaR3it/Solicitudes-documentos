package com.empleos.solicitudes.controller;

import com.empleos.solicitudes.dto.DocumentoDTO;
import com.empleos.solicitudes.service.DocumentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/documentos")
public class DocumentoController {
    
    private final DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    @GetMapping
    public ResponseEntity<List<DocumentoDTO>> findAll() {
        List<DocumentoDTO> documentos = documentoService.findAll();
        if(documentos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(documentos);
    }
}