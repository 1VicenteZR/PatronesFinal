package Singleton;

public class MainSingleton {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Juan");
        Usuario u2 = new Usuario("María");

        Administrador admin = new Administrador();
        Servicio servicio = new Servicio();

        u1.consultarConexion();
        u2.consultarConexion();
        admin.verificarSistema();
        servicio.usarConexion();
    }
}
