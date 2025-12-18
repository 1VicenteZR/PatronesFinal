public class Documento implements Prototype {

    private String titulo;
    private String contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
    }

    @Override
    public Prototype clonar() {
        return new Documento(this.titulo, this.contenido);
    }
}
