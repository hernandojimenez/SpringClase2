package com.meli.demo.controller;

import com.meli.demo.dtos.AlumnoDTO;
import com.meli.demo.dtos.PromedioAlumnoDTO;
import com.meli.demo.service.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @PostMapping("/promedioAlumno")
    public ResponseEntity getAlumno(@RequestBody AlumnoDTO alumnoDTO){
        PromedioAlumnoDTO promedioAlumnoDTO = new PromedioAlumnoDTO();
        AlumnoService alumnoService = new AlumnoService();
        promedioAlumnoDTO = alumnoService.calcularPromedio(alumnoDTO);
        return  new ResponseEntity<>(promedioAlumnoDTO,HttpStatus.OK);

    }
}
