package com.uniajc.modelo;

public class Estudiante {
    private int id_estudiante;
    private String nombre;
    private String apellido;
    private String email;

    public Estudiante() {}

    public Estudiante(int id, String nombre, String apellido, String email) {
        this.id_estudiante = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public int getId_estudiante() { return id_estudiante; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEmail() { return email; }
}