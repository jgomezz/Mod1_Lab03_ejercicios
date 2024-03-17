package pe.edu.tecsup._08.exceptions.personalizado.ejercicio;

public class TestOperationMain {

    static final double LIMITE_OPERACION = 4250;
    static final double LIMITE_OPERACION_SUNAT = 10000;
    
    
	public static void main(String[] args) /*throws Exception*/{
		
		double saldoCuenta = 50000;
		double montoOperacion = 10000;
		
		try {
		
		    // Crear una excepcion en caso se haga una operacion
		    // mayor a 10000 soles deba ser informado a la SUNAT
		    //
		    
		    if(montoOperacion >= LIMITE_OPERACION_SUNAT) {
		          //throw new LimiteOperacionSuperadoSunatException("Esta operacion debe ser notificada a la SUNAT");
		          throw new LimiteOperacionSuperadoSunatException();
		    }
		    
		    
		    // Limite de la transacción : 
//		    validarLimiteOperacion(montoOperacion);
	        if ( montoOperacion > LIMITE_OPERACION) {
	            
	            throw new LimiteOperacionSuperadoException("Se supero el limite de operacion");
	        }
		    
		    //
			validarFondosCuenta(saldoCuenta, montoOperacion);
			
			saldoCuenta = saldoCuenta - montoOperacion;
			System.out.println("Retirando fondos de S/" + montoOperacion);
			System.out.println("Saldo de la Cuenta despues de la operacion S/" + saldoCuenta);
			
		} catch (SinFondosExcepion e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Fin de la aplicacion");
		
		
	}

	private static void validarLimiteOperacion(double montoOperacion) 
	    throws LimiteOperacionSuperadoException{

	    if ( montoOperacion > LIMITE_OPERACION) {
	        
	        throw new LimiteOperacionSuperadoException("Se supero el limite de operacion");
	    }

    }

    /**
	 * 
	 * @param saldo
	 * @param monto
	 * @throws SinFondosExcepion
	 */
	public static void validarFondosCuenta(double saldo, double monto)	
			throws SinFondosExcepion{
		
		
		if( monto > saldo) { // Reglas de negocios
            throw new SinFondosExcepion("Saldo actual, S/" + saldo + ", Monto a retirar: S/" + monto);

		}	
		
	}
	
}
