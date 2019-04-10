package paquete;

public class ProbandoAutobus {

	public static void main(String[] args) {
		Autobus autobus = new Autobus(214.5);
		
		System.out.println("El autobus recorrio " + autobus.obtenerKilometrosRecorridos() + " kilometros");

		System.out.println("ASIGNACION DE CHOFER PARA EL AUTOBUS");
		
		autobus.asignarChofer(new Persona("Martin","Gonzales"));
		
		System.out.println("El chofer actual del autobus es " + autobus.obtenerChofer());
		
		System.out.println("INTENTO CAMBIAR EL CHOFER DEL AUTOBUS CUANDO NO HAY PASAJEROS");
		
		autobus.cambiarChofer(new Persona("Camilo","Juarez"));
		
		System.out.println("El chofer actual del autobus es " + autobus.obtenerChofer());
		
		System.out.println("AGREGO PASAJEROS AL AUTOBUS");
		
		autobus.agregarPasajero(new Persona("Roberto","Luna"));
		autobus.agregarPasajero(new Persona("Carlos","Rios"));
		autobus.agregarPasajero(new Persona("Karina","Cuevas"));
		autobus.agregarPasajero(new Persona("Benjamin","Jimenez"));
		
		for(int i=0; i<autobus.numeroDePasajeros();i++) {
			System.out.println("Pasajero " + (i+1) + " " + autobus.obtenerPasajero(i));
		}
		
		System.out.println("INTENTO CAMBIAR EL CHOFER DEL AUTOBUS CUANDO HAY PASAJEROS");
		
		autobus.cambiarChofer(new Persona("Ramiro", "Pedroza"));
		
	}

}
