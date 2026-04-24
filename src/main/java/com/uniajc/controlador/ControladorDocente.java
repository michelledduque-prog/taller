package com.uniajc.controlador;

import com.uniajc.modelo.Docente;
import com.uniajc.servicios.DocenteService;

public class ControladorDocente {

    private DocenteService service = new DocenteService();

    public void crear(String nombre, String esp) {
        Docente d = new Docente(0, nombre, esp);
        service.crear(d);
    }
}