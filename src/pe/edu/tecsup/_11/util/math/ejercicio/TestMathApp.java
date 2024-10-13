package pe.edu.tecsup._11.util.math.ejercicio;

public class TestMathApp {

	public static void main(String[] args) {
		
		double[] nros = new double[5];
		
		//  Crear 5 números aleatorios entre 0 y 50

		for(int i=0; i<5; i++) {
			double valor = Math.random()*50;
			nros[i] = valor;
			System.out.println("valor: " + valor);
		}

		// Agregar 3 a cada número aleatorio

		for(int i=0; i<5; i++) {
			nros[i] = nros[i] + 3 ;
			System.out.println("valor modificado: " + nros[i]);
		}
		
		
		/*
		
		System.out.println(Math.round(4.7));
		System.out.println(Math.round(4.2));
		System.out.println("--------");
		
		// 1 - 100
		for(int i=0; i<100; i++) {
			// [ round(0*100); round(1*100) >
			long valor = Math.round(Math.random() * 5) + 5;
			System.out.println("valor: " + valor);
		}
		
		
		double test = 12.3;
		System.out.println( Math.round(test) );
		System.out.println( Math.ceil(test) );
		System.out.println( Math.floor(test) );
		
		test = 12.7;
		System.out.println( Math.round(test) );
		System.out.println( Math.ceil(test) );
		System.out.println( Math.floor(test) );
		
		System.out.println(Math.pow(10, 2));
		
		*/

	}

	/*
	   Crear 5 numeros aleatorios entre 0 y 50
	   Agregar 3 a cada numero aleatorio
	   Encontrar el entero superior proximo
	   Elevar a las potencia de 2 los numeros obtenidos en el paso anterio
	
	 */
}
