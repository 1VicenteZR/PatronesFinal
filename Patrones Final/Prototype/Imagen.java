public class Imagen implements Prototype {

    private String nombre;
    private int resolucion;

    public Imagen(String nombre, int resolucion) {
        this.nombre = nombre;
        this.resolucion = resolucion;
    }

    @Override
    public Prototype clonar() {
        return new Imagen(this.nombre, this.resolucion);
    }

    public void mostrar() {
        System.out.println("Imagen: " + nombre + " - Resolución: " + resolucion);
    }
}
