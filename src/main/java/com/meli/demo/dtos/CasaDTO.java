package com.meli.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CasaDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;
}
