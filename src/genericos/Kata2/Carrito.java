package genericos.Kata2;

import java.util.ArrayList;
import java.util.List;

public class Carrito<T> {
    private List<T> elementos;

    public Carrito() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T item) {
        elementos.add(item);
    }

    public void mostrarItems() {
        for (T item : elementos) {
            System.out.println("🛒 " + item);
        }
    }
}
