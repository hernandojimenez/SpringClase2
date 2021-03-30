package com.meli.demo.service;

import com.meli.demo.dtos.AlumnoDTO;
import com.meli.demo.dtos.AsignaturaDTO;
import com.meli.demo.dtos.PromedioAlumnoDTO;

public class AlumnoService {

    public PromedioAlumnoDTO calcularPromedio(AlumnoDTO alumnos){
        PromedioAlumnoDTO promedioAlumnoDTO = new PromedioAlumnoDTO();
        double promedio = 0;
        double sumaNotas=0;
        for(int i=0; i<alumnos.getAsignaturas().size(); i++){
            sumaNotas +=alumnos.getAsignaturas().get(i).getNota();

        }
        promedio = Math.round((sumaNotas/alumnos.getAsignaturas().size())*100.0)/100.0;
        promedioAlumnoDTO.setAlumno(alumnos);
        promedioAlumnoDTO.setPromedio(promedio);
        if(promedio>9){
            promedioAlumnoDTO.setMesage("hoolalalall");
        }
        return promedioAlumnoDTO;
    }
}
