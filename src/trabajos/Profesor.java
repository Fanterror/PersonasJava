package trabajos;

public class Profesor extends Trabajador {

    String materia;

    public void mostrarProfesor() {
        mostrarTrabajo();
        System.out.println("Mi materia es: " + materia);
    }
}