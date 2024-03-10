package pe.edu.tecsup._03.interfaces.referencia;

public class Aplicacion {

	public static void main(String[] args) {

	    // Usando clases
	    Persona persona = new Persona("Ellzabeth","Garcia");
		persona.cantar();		
		persona.obtenerEstadosFinancieros();
		
		
        // Usando clases
        Persona otraPersona = new Persona("Pedro","Valdivia");
        otraPersona.cantar();

		// Usando la interface como referencia    
		HabilidadCantar habilidad; // = new Persona("Eduardo","Guzman");
                
        // Usando la referencia de interfaces para acceder a las dos clases
        habilidad = persona;
        habilidad.cantar();
        //habilidad.obtenerEstadosFinancieros();
        
        habilidad = otraPersona;
        habilidad.cantar();

	}

}
