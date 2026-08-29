package trabajos;

public class Jardinero extends Personas {

    String planta;

    public void mostrarJardinero() {
        mostrarDatos();
        System.out.println("Mi planta favorita es la: " + planta);
    }
}