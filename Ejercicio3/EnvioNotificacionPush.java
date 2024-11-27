package Taller16.Ejercicio3;

public class EnvioNotificacionPush implements EstrategiaEnvio {
    private String dispositivoID;

    // Constructor
    public EnvioNotificacionPush(String dispositivoID) {
        this.dispositivoID = dispositivoID;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación push a dispositivo " + dispositivoID + ": " + mensaje);
    }
}
