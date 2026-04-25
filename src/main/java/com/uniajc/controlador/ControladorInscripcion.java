package main.java.com.uniajc.controlador;

import com.uniajc.servicios.InscripcionService;
import com.uniajc.vista.VistaInscripcion;
import com.uniajc.modelo.InscripcionCurso;

public class ControladorInscripcion {
    private InscripcionService service = new InscripcionService();
    private VistaInscripcion vista = new VistaInscripcion();

    public void registrar(int id, String estudiante, String materia) {
        if (estudiante == null || estudiante.trim().isEmpty()) {
            System.out.println("Error: estudiante vacío");
            return;
        }
        if (materia == null || materia.trim().isEmpty()) {
            System.out.println("Error: materia vacía");
            return;
        }
        InscripcionCurso i = new InscripcionCurso(id, estudiante, materia);
        service.registrar(i);
        System.out.println("Registro realizado correctamente");
    }

    public void mostrarTodas() {
        vista.mostrarLista(service.obtenerTodas());
    }

    public void buscar(int id) {
        InscripcionCurso i = service.buscarPorId(id);
        if (i != null) {
            vista.mostrarInscripcion(i);
        } else {
            System.out.println("Inscripción no encontrada");
        }
    }

    public void eliminar(int id) {
        service.eliminar(id);
        System.out.println("Inscripción eliminada");
    }

    public void actualizar(int id, String estudiante, String materia) {
        service.actualizar(id, estudiante, materia);
        System.out.println("Inscripción actualizada");
    }
}