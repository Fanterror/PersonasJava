package trabajo2;

public class Carro extends Vehiculo{
	int puertas;
	public Carro() {
		super();
		puertas=0;
	}
	public Carro(String marca, int modelo, int puertas) {
		super(marca, modelo);
		this.puertas=puertas;
	}
	public void mostrarCarro() {
		mostrarVehiculo();
		System.out.println("Puertas: " + puertas);
	}
}