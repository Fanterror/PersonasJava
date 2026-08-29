public class Persona{
	String nombre;
	int edad;
	public Persona() {
		nombre="Sin nombre";
		edad=0;
	}
	public Persona(String nombre, int edad) {
	this.nombre=nombre;
	this.edad=edad;
}
	public void mostrarDatos() {
		System.out.println("nombre: " + nombre);
		System.out.println("edad: " + edad);
	}
}