package com.docmach.hospitals.service;

import com.docmach.hospitals.domain.Hospitals;
import com.docmach.hospitals.repository.HospitalsRepository;
import org.springframework.stereotype.Service;

@Service
public class HospitalsService {

    private final HospitalsRepository repository;

    public HospitalsService(HospitalsRepository repository) {
        this.repository = repository;
    }

    public Hospitals create(Hospitals hospitals) {
        return repository.save(hospitals);
    }
}
