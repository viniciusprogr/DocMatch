package com.docmach.hospitals.service;

import com.docmach.hospitals.domain.Hospitals;
import com.docmach.hospitals.repository.HospitalsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HospitalsService {

    private final HospitalsRepository repository;

    public HospitalsService(HospitalsRepository repository) {
        this.repository = repository;
    }

    public Hospitals create(Hospitals hospitals) {
        return repository.save(hospitals);
    }

    public Hospitals getHospitalsById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Hospital com o id:" + id + " nao encontrado"));
    }
}