package pe.edu.tecsup._07.interfaces.nuevas_caracteristicas;








public class Aplicacion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        System.out.println(ServiciosTelecomunicaciones.llamarCallCenter());

        
        ServiciosTelecomunicaciones st = new ServiciosTelecomunicacionesImpl();
        
        System.out.println(st.darAyudaEnLinea());

        // Uso de clases anonimas
        ServiciosTelecomunicaciones st2 = new ServiciosTelecomunicaciones() {
            
            @Override
            public void darAltaEntelefoniaResidencial() {
                System.out.println("Implementacion de metodo desde una clase anonima");

            }

            @Override
            public void darAltaTelevisionPorCable() {
                // TODO Auto-generated method stub

            }
        };
        
     // Uso de clases anonimas
        ServiciosTelecomunicaciones st3 = new ServiciosTelecomunicaciones() {
            
            @Override
            public void darAltaEntelefoniaResidencial() {
                System.out.println("Implementacion de metodo desde una otra clase anonima");

            }

            @Override
            public void darAltaTelevisionPorCable() {
                // TODO Auto-generated method stub

            }
        };
        
        
        
        st2.darAltaEntelefoniaResidencial();
        st3.darAltaEntelefoniaResidencial();

        
    }

}
