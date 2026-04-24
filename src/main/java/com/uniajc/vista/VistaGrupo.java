package com.uniajc.vista;

import com.uniajc.controlador.ControladorGrupo;
import java.util.Scanner;

public class VistaGrupo {

    public void crearGrupo() {

        Scanner sc = new Scanner(System.in);
        ControladorGrupo c = new ControladorGrupo();

        System.out.println("=== GRUPO ===");

        System.out.print("ID Materia: ");
        int idMateria = sc.nextInt();

        System.out.print("ID Docente: ");
        int idDocente = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Aula: ");
        String aula = sc.nextLine();

        System.out.print("Horario: ");
        String horario = sc.nextLine();

        c.crear(idMateria, idDocente, aula, horario);

        System.out.println("Grupo guardado correctamente");
    }
}