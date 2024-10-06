package pe.edu.tecsup._02.interfaces.ejercicio;

public class Computadora implements SoporteTarjetaGrafica {

	protected String tipoCpu;
	protected String tipoFabricante;
	
	
	public void setTipoCpu(String tipoCpu) {
		this.tipoCpu = tipoCpu;
	}
	
	public void setTipoFabricante(String tipoFabricante) {
		this.tipoFabricante = tipoFabricante;
	}

	@Override
	public void realizarJuegosEnLinea() {
		
		if (this.tipoCpu.equals("GPU"))
			System.out.println("Esta computadora soporta juegos en linea");
		else
			System.out.println("Esta computadora NO soporta juegos en linea");
			
	}
	
	
	
}
