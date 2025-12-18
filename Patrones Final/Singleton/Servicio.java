package Singleton;

public class Servicio {

    public void usarConexion() {
        ConexionBD conexion = ConexionBD.getInstancia();
        System.out.println("Servicio usando la misma conexión");
    }
}
