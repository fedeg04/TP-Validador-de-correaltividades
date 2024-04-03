package domain;
import domain.Inscripcion;
import domain.Materia;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String nombre, String apellido, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void aprobarMateria(Materia materia){
        this.materiasAprobadas.add(materia);
    }
}
