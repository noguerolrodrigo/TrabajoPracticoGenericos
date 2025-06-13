package genericos.Kata1;

public class Producto<T> {
    private T valor;

    public Producto(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public void mostrarValor() {
        System.out.println("Valor del producto: " + valor);
    }
}

