package pe.edu.tecsup._02.interfaces.ejercicio;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computadora pc1 = new Computadora();
		pc1.setTipoCpu("CPU");
		pc1.realizarJuegosEnLinea();
		
		
		Computadora pc2 = new Computadora();
		pc2.setTipoCpu("GPU");
		pc2.realizarJuegosEnLinea();
		
		
	}

}
