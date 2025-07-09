package com.hospital.hospital_service.Service;

import com.hospital.hospital_service.Entity.Hospital;
import com.hospital.hospital_service.Repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public List<Hospital> getAllHospitals(){
        return hospitalRepository.findAll();
    }
}
