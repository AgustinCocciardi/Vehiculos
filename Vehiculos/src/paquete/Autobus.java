package paquete;

public class Autobus extends Vehiculo {

	private Persona pasajeros[];
	private static int numeroPasajeros=0;
	private final int CAPACIDAD_MAXIMA=30;
	
	public Autobus(double kilometrosRecorridos) {
		super(kilometrosRecorridos);
		this.pasajeros = new Persona[CAPACIDAD_MAXIMA];
	}
	
	public void agregarPasajero(Persona pasajero) {
		if(numeroPasajeros < CAPACIDAD_MAXIMA) {
			this.pasajeros[numeroPasajeros] = new Persona(pasajero);
			numeroPasajeros++;
		}
		else {
			System.out.println("Se alcanzo la capacidad maxima del autobus");
		}
	}
	
	@Override
	public void cambiarChofer(Persona chofer) {
		if(numeroPasajeros>0) {
			System.out.println("No se puede cambiar de chofer si hay pasajeros a bordo");
		}
		else {
			super.cambiarChofer(chofer);
		}
	}
	
	public String obtenerPasajero(int i) {
		return this.pasajeros[i].toString();
	}
	
	public int numeroDePasajeros() {
		return numeroPasajeros;
	}
	
}
