package com.uniajc;

import java.util.Scanner;
import com.uniajc.vista.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Crear Materia");
            System.out.println("2. Crear Docente");
            System.out.println("3. Crear Estudiante");
            System.out.println("4. Crear Grupo");
            System.out.println("5. Crear Inscripcion");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    new VistaMateria().crearMateria();
                    break;
                case 2:
                    new VistaDocente().crearDocente();
                    break;
                case 3:
                    new VistaEstudiante().crearEstudiante();
                    break;
                case 4:
                    new VistaGrupo().crearGrupo();
                    break;
                case 5:
                    new VistaInscripcion().crearInscripcion();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
