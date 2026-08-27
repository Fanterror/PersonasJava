public class main{
	public static void main(String[] args) {
		public class Persona{
			String nombre;
			int edad;
			String trabajo;
		
		public Persona(String nombre, int edad, Trabajo trabajo)
		this.nombre=nombre;
		this.edad=edad;
		this.trabajo=trabajo;
		}
		public void presentarse() {
			System.out.println("Hola, soy" + nombre);
			System.out.println("Tengo" + edad + "Años");
		}
	}
}