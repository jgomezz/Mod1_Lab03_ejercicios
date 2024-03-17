package pe.edu.tecsup._10.util.fechas.ejercicio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

class FechaUtil {

	final static String FORMAT_DATE = "dd/MM/YYYY HH:mm:ss";

	public static String obtenerFechaActual() {

//		Calendar calendar = GregorianCalendar.getInstance();
//		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
//
//        String fechaActual = sdf.format(calendar.getTime());
//  		return fechaActual;

		return obtenerFechaActual(FORMAT_DATE);
  		
	}
	
	public static String obtenerFechaActual(String formato) {

		Calendar calendar = GregorianCalendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(formato);

        String fechaActual = sdf.format(calendar.getTime());
  		return fechaActual;
	}
	
}


public class Aplicacion {


	public static void main(String[] args) {

		String fechaActual = FechaUtil.obtenerFechaActual();
		
		System.out.println(fechaActual);
		
		String fechaActual2 = FechaUtil.obtenerFechaActual("YYYY");
		
		System.out.println(fechaActual2);
		
	}

}
