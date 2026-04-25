package com.uniajc.controlador;

import com.uniajc.modelo.Estudiante;
import com.uniajc.servicios.EstudianteService;

public class ControladorEstudiante {

    private EstudianteService service = new EstudianteService();

    public void crear(String nombre, String apellido, String email) {
        Estudiante e = new Estudiante(0, nombre, apellido, email);
        service.crear(e);
    }
}