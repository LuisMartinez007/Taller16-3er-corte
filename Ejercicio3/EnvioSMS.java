package Taller16.Ejercicio3;

public class EnvioSMS implements EstrategiaEnvio {
    private String numeroTelefono;

    // Constructor
    public EnvioSMS(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS a " + numeroTelefono + ": " + mensaje);
    }
}

