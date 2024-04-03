package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class InscripcionTest {
    @Test
    public void inscripcionAprobada(){
        Materia algoritmos = new Materia("algoritmos", Collections.emptyList());
        Materia ads = new Materia("ads", Collections.singletonList(algoritmos));
        Alumno unAlumno = new Alumno("Federico",  "Gallardo", Arrays.asList(ads,algoritmos));
        Materia dds = new Materia("Diseño de sistemas", Arrays.asList(ads,algoritmos));
        Inscripcion unaInscripcion = new Inscripcion(unAlumno,Collections.singletonList(dds));

        Assert.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void inscripcionRechazada(){
        Materia algoritmos = new Materia("algoritmos", Collections.emptyList());
        Materia ads = new Materia("ads", Collections.singletonList(algoritmos));
        Alumno unAlumno = new Alumno("Federico",  "Gallardo", Collections.singletonList(algoritmos));
        Materia dds = new Materia("Diseño de sistemas", Arrays.asList(ads,algoritmos));
        Inscripcion unaInscripcion = new Inscripcion(unAlumno,Collections.singletonList(dds));

        Assert.assertFalse(unaInscripcion.aprobada());
    }



}
