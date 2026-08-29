package trabajos;

public class Main {
    public static void main(String[] args) {
        Jardinero jardinero = new Jardinero();
        jardinero.nombre = "Carlos";
        jardinero.edad = 47;
        jardinero.planta = "Amapola";
        System.out.println("El jardinero dice: ");
        jardinero.mostrarJardinero();
        Profesor profesor = new Profesor();
        profesor.empresa = "Uniempresarial";
        profesor.salario = 43942304;
        profesor.materia = "Algebra";
        System.out.println("\nEl profesor dice: ");
        profesor.mostrarProfesor();
    }
}