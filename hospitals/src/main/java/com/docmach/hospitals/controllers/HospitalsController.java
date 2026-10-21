package com.docmach.hospitals.controllers;

import com.docmach.hospitals.domain.Hospitals;
import com.docmach.hospitals.dto.HospitalsRequestDto;
import com.docmach.hospitals.dto.HospitalsResponseDto;
import com.docmach.hospitals.mapper.HospitalsMapper;
import com.docmach.hospitals.service.HospitalsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hospitals")
public class HospitalsController {

    private final HospitalsService service;

    private final HospitalsMapper mapper;

    public HospitalsController(HospitalsService service, HospitalsMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping("/create")
    public ResponseEntity<HospitalsResponseDto> create(@RequestBody HospitalsRequestDto requestDto) {
        Hospitals hospitalEntity = mapper.toEntity(requestDto);
        Hospitals savedHospital = service.create(hospitalEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toResponseDto(savedHospital));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HospitalsResponseDto> getHospitals(@PathVariable Long id) {
        Hospitals hospitalEntity = service.getHospitalsById(id);
        return ResponseEntity.ok(mapper.toResponseDto(hospitalEntity));
    }
}
