package trabajo2;

public class Vehiculo{
	String marca;
	int modelo;
	
	public Vehiculo() {
		marca="Sin marca";
		modelo=0;
	}
	public Vehiculo(String marca, int modelo) {
		this.marca=marca;
		this.modelo=modelo;
	}
	public void mostrarVehiculo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
	}
}