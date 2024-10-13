package pe.edu.tecsup._09.object;

public class Persona {

	private Integer codigo;
	
	private String nombre;
	
	private String apellidos;
	
	private int edad;
	


	public Integer getCodigo() {
		return codigo;
	}



	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	//*
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Persona) {
		
			Persona persona = (Persona) obj;
			
			// Cuales son tus criterios para comparar contenidos
			// entre objetos
			if(persona.getApellidos().equals(this.apellidos) && 
			   (persona.getEdad() == this.edad)) {
				return true;
			}
		}
		
		return false;
	}//*/

}
