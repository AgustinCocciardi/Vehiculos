package paquete;

public class Motocicleta extends Vehiculo{
	
	private Persona acompa�ante;
	
	public Motocicleta(double kilometrosRecorridos) {
		super(kilometrosRecorridos);
	}
	
	public void agregarAcompa�ante(Persona acompa�ante) {
		if(this.acompa�ante == null) {
			this.acompa�ante = new Persona(acompa�ante); 
		}
		else {
			System.out.println("No puede haber mas de un acompa�ante en la motocicleta");
		}
		
	}
	
	@Override
	public void cambiarChofer(Persona chofer) {
		if(this.acompa�ante == null) {
			super.cambiarChofer(chofer);
		}
		else {
			System.out.println("No se puede cambiar de chofer si hay un acompa�ante");
		}
	}
	
	public String obtenerAcompa�ante() {
		return this.acompa�ante.toString();
	}
}
