package main.java.com.uniajc.dao;

import com.uniajc.modelo.InscripcionCurso;
import java.util.ArrayList;
import java.util.List;

public class InscripcionDao {
    private List<InscripcionCurso> lista = new ArrayList<>();

    public void guardar(InscripcionCurso inscripcion) {
        lista.add(inscripcion);
    }

    public List<InscripcionCurso> listar() {
        return lista;
    }

    public InscripcionCurso buscar(int id) {
        for (InscripcionCurso i : lista) {
            if (i.getId() == id) return i;
        }
        return null;
    }

    public void eliminar(int id) {
        lista.removeIf(i -> i.getId() == id);
    }

    public void actualizar(InscripcionCurso inscripcion) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == inscripcion.getId()) {
                lista.set(i, inscripcion);
                break;
            }
        }
    }
}