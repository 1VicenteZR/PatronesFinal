package Singleton;

public class Usuario {

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void consultarConexion() {
        ConexionBD conexion = ConexionBD.getInstancia();
        System.out.println(nombre + " -> " + conexion.getEstado());
    }
}
