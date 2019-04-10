package paquete;

public class ProbandoMotocicleta {

	public static void main(String[] args) {
		
		Motocicleta moto = new Motocicleta(135);
		
		System.out.println("La motocicleta recorrio " + moto.obtenerKilometrosRecorridos() + " kilometros");
		
		System.out.println("ASIGNACION DE CHOFER PARA LA MOTO");
		
		moto.asignarChofer(new Persona("Julio","Rodriguez"));
		
		System.out.println("El chofer actual de la moto es " + moto.obtenerChofer());
		
		System.out.println("INTENTO CAMBIAR EL CHOFER DE LA MOTO CUANDO NO TIENE ACOMPA�ANTE");
		
		moto.cambiarChofer(new Persona("Esteban","Gimenez"));
		
		System.out.println("El chofer actual de la moto es " + moto.obtenerChofer());
		
		System.out.println("AGREGO UN ACOMPA�ANTE A LA MOTO");
		
		moto.agregarAcompa�ante(new Persona("Pablo","Ferreyra"));
		
		System.out.println("El acompa�ante que viaja en moto es " + moto.obtenerAcompa�ante());
		
		System.out.println("INTENTO CAMBIAR EL CHOFER DE LA MOTO CUANDO TIENE ACOMPA�ANTE");
		
		moto.cambiarChofer(new Persona("Gerardo","Alvarez"));
		
		System.out.println("El chofer actual de la moto es " + moto.obtenerChofer());	
		
		System.out.println("INTENTO ASIGNAR UN ACOMPA�ANTE MAS A LA MOTO");
		
		moto.agregarAcompa�ante(new Persona("Juan","Robles"));
		
		System.out.println("El acompa�ante que viaja en moto es " + moto.obtenerAcompa�ante());
	}

}
