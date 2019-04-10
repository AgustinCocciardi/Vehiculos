package paquete;

public class Persona {
	
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public Persona(Persona persona) {
		this.apellido = persona.apellido;
		this.nombre = persona.nombre;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido ;
	}
	
}
