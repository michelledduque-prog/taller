package com.uniajc.vista;

import com.uniajc.controlador.ControladorDocente;
import java.util.Scanner;

public class VistaDocente {

    public void crearDocente() {

        Scanner sc = new Scanner(System.in);
        ControladorDocente c = new ControladorDocente();

        System.out.println("=== DOCENTE ===");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        
        c.crear(nombre, apellido);

        System.out.println("Docente guardado correctamente");
    }
}


