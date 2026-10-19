package com.docmach.hospitals.mapper;


import com.docmach.hospitals.domain.Hospitals;
import com.docmach.hospitals.dto.HospitalsRequestDto;
import com.docmach.hospitals.dto.HospitalsResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class HospitalsMapper {
    private final ModelMapper modelMapper;

    public HospitalsMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    public Hospitals toEntity(HospitalsRequestDto requestDto) {
        return modelMapper.map(requestDto, Hospitals.class);

    }

    public HospitalsResponseDto toResponseDto(Hospitals savedHospital) {
        return modelMapper.map(savedHospital, HospitalsResponseDto.class);
    }
}
