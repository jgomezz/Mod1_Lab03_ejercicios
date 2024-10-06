package pe.edu.tecsup._07.interfaces.nuevas_caracteristicas;

/**
 *  Soportes a partir de la version JDK 1.8
 * @author jgomez
 *
 */
public interface ServiciosTelecomunicaciones {

    void darAltaEntelefoniaResidencial();

    void darAltaTelevisionPorCable();

    // Implementa metodo
    default String darAyudaEnLinea() {

        return "Vuelva a llamar que tenemos un problema con el Sistema";
    }

    // Puede llamar a metodo privados de la interface
    default String realizarReclamo() {

        int deuda = obtenerDeuda();
        if (deuda > 0)
            return "No puede hacer reclamos porque tiene una deuda pendiente";
        else
            return "¿Cual es su reclamo?";
    }

    // Define un metodo privado
    private int obtenerDeuda() {

        return 100;
    }

    // Define un metodo estatico
    static String llamarCallCenter() {

        return "Llamar en horario de oficina";
    }

}
