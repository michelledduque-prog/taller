package main.java.com.uniajc.modelo;

public class InscripcionCurso {
    private int id;
    private String estudiante;
    private String materia;

    public InscripcionCurso(int id, String estudiante, String materia) {
        this.id = id;
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public int getId() { return id; }
    public String getEstudiante() { return estudiante; }
    public String getMateria() { return materia; }
    public void setEstudiante(String estudiante) { this.estudiante = estudiante; }
    public void setMateria(String materia) { this.materia = materia; }
}