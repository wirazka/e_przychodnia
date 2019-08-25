package com.example.demo.repository;

import com.example.demo.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findBySpecialization(String searchedSpecialization);
    List<Doctor> findBySurname(String searchedSurname);
    List<Doctor> findByWorkPlace(String workPlace);

}
