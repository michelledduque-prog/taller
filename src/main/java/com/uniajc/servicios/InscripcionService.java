package main.java.com.uniajc.servicios;

import com.uniajc.dao.InscripcionDao;
import com.uniajc.modelo.InscripcionCurso;
import java.util.List;

public class InscripcionService {
    private InscripcionDao dao = new InscripcionDao();

    public void registrar(InscripcionCurso inscripcion) {
        dao.guardar(inscripcion);
    }

    public List<InscripcionCurso> obtenerTodas() {
        return dao.listar();
    }

    public InscripcionCurso buscarPorId(int id) {
        return dao.buscar(id);
    }

    public void eliminar(int id) {
        dao.eliminar(id);
    }

    public void actualizar(int id, String estudiante, String materia) {
        InscripcionCurso i = dao.buscar(id);
        if (i != null) {
            i.setEstudiante(estudiante);
            i.setMateria(materia);
            dao.actualizar(i);
        }
    }
}