package pe.edu.tecsup._01.paquetes.ejercicio.modelo;

public class Proceso {

	protected String codigo;
	protected boolean estado;

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Proceso [codigo=" + codigo + ", estado=" + estado + "]";
	}

}
