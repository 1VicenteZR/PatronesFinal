public class MainPrototype {

    public static void main(String[] args) {

        GestorPrototipos gestor = new GestorPrototipos();

        gestor.agregarPrototipo("doc",
                new Documento("Tarea", "Patrón Prototype"));

        gestor.agregarPrototipo("img",
                new Imagen("Foto", 1080));

        Documento doc = (Documento) gestor.obtenerClon("doc");
        Imagen img = (Imagen) gestor.obtenerClon("img");

        doc.mostrar();
        img.mostrar();
    }
}
