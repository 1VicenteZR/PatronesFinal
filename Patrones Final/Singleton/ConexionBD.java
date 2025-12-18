package Singleton;

public class ConexionBD {

    private static ConexionBD instancia;
    private String estado;

    private ConexionBD() {
        estado = "Conectado";
    }

    public static ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public String getEstado() {
        return estado;
    }
}
