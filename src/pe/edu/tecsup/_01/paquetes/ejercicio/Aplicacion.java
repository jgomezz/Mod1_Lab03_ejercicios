package pe.edu.tecsup._01.paquetes.ejercicio;

import pe.edu.tecsup._01.paquetes.ejercicio.controlador.ProcesoControlador;
import pe.edu.tecsup._01.paquetes.ejercicio.modelo.Proceso;

public class Aplicacion {
	
	public static void main(String[] args) {
		
		ProcesoControlador pc  = new ProcesoControlador();
		
		pc.verificarProceso();
		
		Proceso p = new Proceso();
		
		p.setCodigo("X01");
		p.setEstado(true);
		
		System.out.println(p);
	
	}
}
