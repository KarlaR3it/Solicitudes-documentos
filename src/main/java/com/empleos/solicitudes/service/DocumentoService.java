package com.empleos.solicitudes.service;

import com.empleos.solicitudes.dto.DocumentoDTO;
import com.empleos.solicitudes.repository.DocumentoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocumentoService {
    
    private final DocumentoRepository documentoRepository;
    private final ModelMapper modelMapper;

    public DocumentoService(DocumentoRepository documentoRepository, ModelMapper modelMapper) {
        this.documentoRepository = documentoRepository;
        this.modelMapper = modelMapper;
    }

    public List<DocumentoDTO> findAll() {
        return documentoRepository.findAll().stream()
                .map(documento -> modelMapper.map(documento, DocumentoDTO.class))
                .collect(Collectors.toList());
    }
}
