package Taller16.Ejercicio3;

public class EnvioCorreoElectronico implements EstrategiaEnvio {
    private String email;

    // Constructor
    public EnvioCorreoElectronico(String email) {
        this.email = email;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico a " + email + ": " + mensaje);
    }
}
