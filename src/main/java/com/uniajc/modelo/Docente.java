package com.uniajc.modelo;

public class Docente {
    private int id_docente;
    private String nombre;
    private String especialidad;

    public Docente() {}

    public Docente(int id_docente, String nombre, String especialidad) {
        this.id_docente = id_docente;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getId_docente() {
        return id_docente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}