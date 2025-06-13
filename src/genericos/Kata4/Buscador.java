package genericos.Kata4;

import java.util.List;

public class Buscador {
    public static <T extends Identificable> T buscarPorId(List<T> lista, int idBuscado) {
        for (T elemento : lista) {
            if (elemento.getId() == idBuscado) {
                return elemento;
            }
        }
        return null;
    }
}
