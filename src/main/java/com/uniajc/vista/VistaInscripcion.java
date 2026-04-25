package com.uniajc.vista;

import java.util.Scanner;
import com.uniajc.controlador.ControladorInscripcion;

public class VistaInscripcion {

    public void crearInscripcion() {

        Scanner sc = new Scanner(System.in);
        ControladorInscripcion c = new ControladorInscripcion();

        System.out.println("=== INSCRIPCIÓN ===");

        System.out.print("ID Estudiante: ");
        int idEstudiante = sc.nextInt();

        System.out.print("ID Grupo: ");
        int idGrupo = sc.nextInt();

        c.crear(idEstudiante, idGrupo);

        System.out.println("Inscripción guardada correctamente");
    }
}
