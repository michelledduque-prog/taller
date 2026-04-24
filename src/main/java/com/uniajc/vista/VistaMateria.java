package com.uniajc.vista;

import com.uniajc.controlador.ControladorMateria;
import java.util.Scanner;

public class VistaMateria {

    public void crearMateria() {

        Scanner sc = new Scanner(System.in);
        ControladorMateria c = new ControladorMateria();

        System.out.println("=== MATERIA ===");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Creditos: ");
        int creditos = sc.nextInt();

        c.crear(nombre, creditos);

        System.out.println("Materia guardada correctamente");
    }
}