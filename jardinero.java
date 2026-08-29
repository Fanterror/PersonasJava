public class jardinero extends persona{
	String herramienta
	String planta;
	public void decirJardinero() {
		mostrarDatos();
		System.out.println("Estoy usando una " + "y estoy plantando un/a: " + planta);
	}
}