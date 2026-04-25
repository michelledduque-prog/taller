package com.uniajc.vista;

import java.util.Scanner;

import com.uniajc.controlador.ControladorEstudiante;

public class VistaEstudiante {

    public void crearEstudiante() {

        Scanner sc = new Scanner(System.in);
        ControladorEstudiante c = new ControladorEstudiante();

        System.out.println("=== ESTUDIANTE ===");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        c.crear(nombre, apellido, email);

        System.out.println("Estudiante guardado correctamente");
    }
}