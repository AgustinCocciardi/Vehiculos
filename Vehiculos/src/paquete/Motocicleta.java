package paquete;

public class Motocicleta extends Vehiculo{
	
	private Persona acompañante;
	
	public Motocicleta(double kilometrosRecorridos) {
		super(kilometrosRecorridos);
	}
	
	public void agregarAcompañante(Persona acompañante) {
		if(this.acompañante == null) {
			this.acompañante = new Persona(acompañante); 
		}
		else {
			System.out.println("No puede haber mas de un acompañante en la motocicleta");
		}
		
	}
	
	@Override
	public void cambiarChofer(Persona chofer) {
		if(this.acompañante == null) {
			super.cambiarChofer(chofer);
		}
		else {
			System.out.println("No se puede cambiar de chofer si hay un acompañante");
		}
	}
	
	public String obtenerAcompañante() {
		return this.acompañante.toString();
	}
}
