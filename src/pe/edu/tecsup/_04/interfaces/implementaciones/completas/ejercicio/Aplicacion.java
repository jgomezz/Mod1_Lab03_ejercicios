package pe.edu.tecsup._04.interfaces.implementaciones.completas.ejercicio;

public class Aplicacion {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.setNombres("Ellzabeth");
		
		persona.setApellidos("Garcia");
		
		// Llamo al comportamiento cantar
		persona.cantar();

		// Llamo al comportamiento correr
		persona.correr();
		
		// Llamo al comportamiento nadar
		persona.nadar();	}

}
