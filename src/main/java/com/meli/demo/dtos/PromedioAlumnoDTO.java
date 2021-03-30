package com.meli.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromedioAlumnoDTO {
    private AlumnoDTO alumno;
    private double promedio;
    private String mesage;
}
