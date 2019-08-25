package com.example.demo.dto.doctor;

import jdk.nashorn.internal.runtime.Specialization;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SpecializationDTO {
    private Specialization id;
    private String name;
}
