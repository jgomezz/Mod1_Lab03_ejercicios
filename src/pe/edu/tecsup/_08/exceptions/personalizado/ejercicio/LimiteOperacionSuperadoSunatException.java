package pe.edu.tecsup._08.exceptions.personalizado.ejercicio;

public class LimiteOperacionSuperadoSunatException extends Exception {

    public LimiteOperacionSuperadoSunatException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public LimiteOperacionSuperadoSunatException() {
        super("Esta operacion debe ser notificada a la SUNAT");
    }


}
