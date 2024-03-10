package pe.edu.tecsup._03.interfaces.referencia;


public class Persona implements HabilidadCantar{

	private String nombres;
	
	private String apellidos;


	public Persona(String nombres, String apellidos) {
        super();
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

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
	
	public void obtenerEstadosFinancieros() {
	    
	    // TODO
	}



}
