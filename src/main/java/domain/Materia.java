package domain;

import java.util.List;

public class Materia {
    private String nombreMateria;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombreMateria = nombre;
        this.correlativas = correlativas;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
