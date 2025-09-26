package com.empleos.solicitudes.controller;

import com.empleos.solicitudes.dto.SolicitudDTO;
import com.empleos.solicitudes.service.SolicitudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/solicitudes")
public class SolicitudController {
    private final SolicitudService solicitudService;

    public SolicitudController(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }
    @PostMapping
    public ResponseEntity<SolicitudDTO> save(@RequestBody SolicitudDTO solicitudDTO){
        return new ResponseEntity<>(solicitudService.save(solicitudDTO), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<SolicitudDTO>> findAll(){
        List<SolicitudDTO> solicitudDTOS = solicitudService.findAll();
        if(solicitudDTOS.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(solicitudDTOS);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SolicitudDTO> finById(@PathVariable Integer id){
        return  solicitudService.findById(id).map(
                ResponseEntity::ok
        ).orElseGet(()-> ResponseEntity.notFound().build()
        );
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id){
        if(solicitudService.deleteById(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<SolicitudDTO> update(@PathVariable Integer id, @RequestBody SolicitudDTO solicitudDTO){
        solicitudDTO.setId(id);
        return solicitudService.update(solicitudDTO).map(
                ResponseEntity::ok
        ).orElseGet(
                ()-> ResponseEntity.notFound().build()
        );
    }

}
