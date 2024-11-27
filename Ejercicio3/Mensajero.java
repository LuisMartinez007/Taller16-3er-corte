package Taller16.Ejercicio3;

public class Mensajero {
    private String email;
    private EstrategiaEnvio estrategiaEnvio; 
    // Constructor
    public Mensajero() {
        
     }

    public Mensajero(String email) {
        this.email = email;
    }

    // Método para enviar correo electrónico
    public void enviarCorreoElectronico(String mensaje) {
        System.out.println("Enviando correo electrónico a " + email + ": " + mensaje);
    }

    // Getter y setter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para establecer la estrategia de envío 
    public void setEstrategiaEnvio(EstrategiaEnvio estrategiaEnvio) { 
        this.estrategiaEnvio = estrategiaEnvio; } 
        // Método para enviar usando la estrategia establecida 
        public void enviar(String mensaje) { 
            if (estrategiaEnvio != null) { 
                estrategiaEnvio.enviar(mensaje); 
            } else { 
                System.out.println("No se ha establecido una estrategia de envío.");
             } 
        }
}

