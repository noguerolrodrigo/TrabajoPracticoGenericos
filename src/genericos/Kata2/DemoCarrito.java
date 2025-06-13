package genericos.Kata2;

public class DemoCarrito {
    public static void main(String[] args) {
        Carrito<String> carritoDeLibros = new Carrito<>();
        carritoDeLibros.agregar("El principito");
        carritoDeLibros.agregar("1984");
        carritoDeLibros.mostrarItems();

        Carrito<Integer> carritoNumeros = new Carrito<>();
        carritoNumeros.agregar(10);
        carritoNumeros.agregar(25);
        carritoNumeros.mostrarItems();
    }
}
