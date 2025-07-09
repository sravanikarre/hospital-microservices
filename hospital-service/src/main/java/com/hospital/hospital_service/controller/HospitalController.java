package com.hospital.hospital_service.controller;


import com.hospital.hospital_service.Entity.Hospital;
import com.hospital.hospital_service.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping
    public String getAllHospitals(){
        return "Welcome to Hospital Service";

    }
}
