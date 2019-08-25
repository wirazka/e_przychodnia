package com.example.demo.entity;

import com.example.demo.dto.doctor.DoctorDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "second_name")
    private String surname;
    private String specialization;
    private String workPlace;

    @OneToMany
    private Set<DoctorAvailability> availabilities;

    public DoctorDTO toDTO() {
        return DoctorDTO.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .specialization(specialization)
                .build();
    }
}
