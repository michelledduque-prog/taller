package main.java.com.uniajc.vista;

import java.util.List;
import com.uniajc.modelo.InscripcionCurso; // ← corregido: dao → modelo

public class VistaInscripcion {

    public void mostrarInscripcion(InscripcionCurso i) {
        System.out.println("ID: " + i.getId());
        System.out.println("Estudiante: " + i.getEstudiante());
        System.out.println("Materia: " + i.getMateria());
        System.out.println("------------------------");
    }

    public void mostrarLista(List<InscripcionCurso> lista) {
        for (InscripcionCurso i : lista) {
            mostrarInscripcion(i);
        }
    }
}