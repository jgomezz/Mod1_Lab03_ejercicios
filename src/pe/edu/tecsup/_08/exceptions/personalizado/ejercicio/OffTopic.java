package pe.edu.tecsup._08.exceptions.personalizado.ejercicio;

public class OffTopic {

	public static void main(String[] args) throws Exception {
		
		String invitado = "Ricardo";
		String[] personas = {"Juan","Maria","Isabel"};
		boolean status = false;
		
		
		for (String persona : personas) {
			if(invitado.equals(persona)) {
				status = true;
			}
		}
		
		if (!status)
			throw new Exception("No fue invitado ..!");
		else 
			System.out.println("Esta invitado");
		
		
	}

}
