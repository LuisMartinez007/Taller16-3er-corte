package Taller16.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Mensajero
        Mensajero mensajero = new Mensajero();

        // Usar la estrategia de envío de correo electrónico
        mensajero.setEstrategiaEnvio(new EnvioCorreoElectronico("example@example.com"));
        mensajero.enviar("Hola, este es un mensaje de prueba.");

        // Usar la estrategia de envío de SMS
        mensajero.setEstrategiaEnvio(new EnvioSMS("123-456-7890"));
        mensajero.enviar("Hola, este es un mensaje de prueba.");

        // Usar la estrategia de envío de notificación push
        mensajero.setEstrategiaEnvio(new EnvioNotificacionPush("dispositivo123"));
        mensajero.enviar("Hola, este es un mensaje de prueba.");
    }
}
