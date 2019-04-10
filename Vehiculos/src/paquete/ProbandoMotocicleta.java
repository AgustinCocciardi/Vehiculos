package paquete;

public class ProbandoMotocicleta {

	public static void main(String[] args) {
		
		Motocicleta moto = new Motocicleta(135);
		
		System.out.println("La motocicleta recorrio " + moto.obtenerKilometrosRecorridos() + " kilometros");
		
		System.out.println("ASIGNACION DE CHOFER PARA LA MOTO");
		
		moto.asignarChofer(new Persona("Julio","Rodriguez"));
		
		System.out.println("El chofer actual de la moto es " + moto.obtenerChofer());
		
		System.out.println("INTENTO CAMBIAR EL CHOFER DE LA MOTO CUANDO NO TIENE ACOMPAÑANTE");
		
		moto.cambiarChofer(new Persona("Esteban","Gimenez"));
		
		System.out.println("El chofer actual de la moto es " + moto.obtenerChofer());
		
		System.out.println("AGREGO UN ACOMPAÑANTE A LA MOTO");
		
		moto.agregarAcompañante(new Persona("Pablo","Ferreyra"));
		
		System.out.println("El acompañante que viaja en moto es " + moto.obtenerAcompañante());
		
		System.out.println("INTENTO CAMBIAR EL CHOFER DE LA MOTO CUANDO TIENE ACOMPAÑANTE");
		
		moto.cambiarChofer(new Persona("Gerardo","Alvarez"));
		
		System.out.println("El chofer actual de la moto es " + moto.obtenerChofer());	
		
		System.out.println("INTENTO ASIGNAR UN ACOMPAÑANTE MAS A LA MOTO");
		
		moto.agregarAcompañante(new Persona("Juan","Robles"));
		
		System.out.println("El acompañante que viaja en moto es " + moto.obtenerAcompañante());
	}

}
