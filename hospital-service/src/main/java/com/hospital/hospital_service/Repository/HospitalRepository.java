package com.hospital.hospital_service.Repository;

import com.hospital.hospital_service.Entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
}
