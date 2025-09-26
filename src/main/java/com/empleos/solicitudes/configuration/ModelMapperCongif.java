package com.empleos.solicitudes.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.empleos.solicitudes.dto.DocumentoDTO;

@Configuration
public class ModelMapperCongif {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
            .setSkipNullEnabled(true)
            .setAmbiguityIgnored(true);
        
        modelMapper.createTypeMap(com.empleos.solicitudes.model.Documento.class, 
                                com.empleos.solicitudes.dto.DocumentoDTO.class)
                  .addMapping(src -> src.getSolicitudId(), DocumentoDTO::setSolicitudId);
        
        return modelMapper;
    }
}