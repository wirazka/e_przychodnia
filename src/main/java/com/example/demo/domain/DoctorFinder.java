package com.example.demo.domain;

import com.example.demo.dto.doctor.DoctorDTO;
import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorFinder {

    private final DoctorRepository doctorRepository;

    public List<DoctorDTO> findBySpecialization(String specialization) {
        return doctorRepository.findBySpecialization(specialization)
                .stream()
                .map(Doctor::toDTO)
                .collect(Collectors.toList());
    }

    public DoctorDTO findById(Long id) {
        return doctorRepository.findById(id)
                .map(Doctor::toDTO)
                .orElseThrow(() -> new IllegalStateException("Nie istnieje taki lekarz"));
    }

    public List<DoctorDTO> findBySurname(String surname) {
        return doctorRepository.findBySurname(surname)
                .stream()
                .map(Doctor::toDTO)
                .collect(Collectors.toList());
    }

    public List<DoctorDTO> findByWorkPlace(String workPlace) {
        return doctorRepository.findByWorkPlace(workPlace)
                .stream()
                .map(Doctor::toDTO)
                .collect(Collectors.toList());
    }
}
