package com.empleos.solicitudes.service;

import com.empleos.solicitudes.dto.SolicitudDTO;
import com.empleos.solicitudes.model.Solicitud;
import com.empleos.solicitudes.repository.SolicitudRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SolicitudService {
    private final SolicitudRepository solicitudRepository;
    private final ModelMapper modelMapper;

    public SolicitudService(SolicitudRepository solicitudRepository, ModelMapper modelMapper) {
        this.solicitudRepository = solicitudRepository;
        this.modelMapper = modelMapper;
    }
    //save
    public SolicitudDTO save(SolicitudDTO solicitudDTO) {
        Solicitud solicitud = modelMapper.map(solicitudDTO, Solicitud.class);
        return modelMapper.map(solicitudRepository.save(solicitud), SolicitudDTO.class);
    }

    //find all
    public List<SolicitudDTO> findAll (){
        return solicitudRepository.findAll().stream().map(
                solicitud -> {
                    return modelMapper.map(solicitud, SolicitudDTO.class);
                }
        ).collect(Collectors.toList());
    }
    //find by id
    public Optional<SolicitudDTO> findById(Integer id){
        return solicitudRepository.findById(id).map(
                solicitud -> {
                    return modelMapper.map(solicitud, SolicitudDTO.class);
                }
        );
    }

    //delete by id
    public boolean deleteById(Integer id){
        return solicitudRepository.findById(id).map(
                solicitud -> {
                    solicitudRepository.delete(solicitud);
                    return true;
                }
        ).orElse(false);
    }

    //update
    public Optional<SolicitudDTO> update(SolicitudDTO solicitudDTO){
        Solicitud solicitud = modelMapper.map(solicitudDTO, Solicitud.class);
        return solicitudRepository.findById(solicitud.getId()).map(
                solicitudDB -> {
                    return modelMapper.map(solicitudRepository.save(solicitud), SolicitudDTO.class);
                }
        );
    }

}
