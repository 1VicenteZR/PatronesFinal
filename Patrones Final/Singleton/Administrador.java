package Singleton;

public class Administrador {

    public void verificarSistema() {
        ConexionBD conexion = ConexionBD.getInstancia();
        System.out.println("Administrador revisa: " + conexion.getEstado());
    }
}
