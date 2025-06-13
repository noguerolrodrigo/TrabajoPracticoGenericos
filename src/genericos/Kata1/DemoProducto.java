package genericos.Kata1;

public class DemoProducto {
    public static void main(String[] args) {
        Producto<String> productoTexto = new Producto<>("Auriculares");
        productoTexto.mostrarValor();

        Producto<Integer> productoCantidad = new Producto<>(15);
        productoCantidad.mostrarValor();
    }
}

