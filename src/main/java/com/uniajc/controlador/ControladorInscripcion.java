package com.uniajc.controlador;

import com.uniajc.modelo.Inscripcion;
import com.uniajc.servicios.InscripcionService;

public class ControladorInscripcion {

    private InscripcionService service = new InscripcionService();

    public void crear(int idEstudiante, int idGrupo) {
        Inscripcion i = new Inscripcion(0, idEstudiante, idGrupo);
        service.crear(i);
    }
}
