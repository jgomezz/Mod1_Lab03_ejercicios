package pe.edu.tecsup._04.interfaces.implementaciones.completas.ejercicio;


public class Persona
	implements HabilidadCantar, 
			   HabilidadCorrer,
			   HabilidadNadar{

	private String nombres;
	
	private String apellidos;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public void cantar() {
		System.out.println("Me llamo " + this.nombres + " y me encanta cantar...");
		
	}

	@Override
	public void correr() {
		System.out.println("Me llamo " + this.nombres + " y suelo correr por las tardes");
		
	}

	@Override
	public void nadar() {
		System.out.println("Me llamo " + this.nombres + " y me gusta nadar");
		
	}


}
