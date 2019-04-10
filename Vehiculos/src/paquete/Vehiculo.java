package paquete;

public class Vehiculo {
	
	private double kilometrosRecorridos;
	private Persona chofer;
	
	public Vehiculo(double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
		this.chofer = new Persona("", ""); 
	}
	
	public void asignarChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	public void cambiarChofer(Persona chofer) {
		if(this.chofer == null) {
			System.out.println("No se puede cambiar chofer porque no hay chofer asignado");
		}
		else {
			this.asignarChofer(chofer);
		}
	}
	
	public double obtenerKilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}
	
	public String obtenerChofer() {
		return this.chofer.toString();
	}
	
}
