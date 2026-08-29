public class trabajador extends Persona{
	String herramienta
	String planta;
	public void decirEstudiante() {
		mostrarDatos();
		System.out.println("Estoy usando una " + "y estoy plantando un/a: " + planta);
	}
}