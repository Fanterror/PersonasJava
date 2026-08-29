package trabajo2;

public class Estudiante extends Persona{
	String carrera;
	public Estudiante() {
		Super();
		carrera="Sin carrera";
	}
	public Estudiante(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera=carrera;
	}
	public void mostrarEstudiante() {
		mostrarDatos();
		System.out.println("Carrera: " carrera);
	}
}