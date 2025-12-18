import java.util.HashMap;
import java.util.Map;

public class GestorPrototipos {

    private Map<String, Prototype> prototipos = new HashMap<>();

    public void agregarPrototipo(String clave, Prototype prototype) {
        prototipos.put(clave, prototype);
    }

    public Prototype obtenerClon(String clave) {
        return prototipos.get(clave).clonar();
    }
}
