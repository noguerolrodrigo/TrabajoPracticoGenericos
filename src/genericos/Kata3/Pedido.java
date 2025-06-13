package genericos.Kata3;

import java.time.LocalDate;

public class Pedido {
    private int id;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " - Fecha: " + fecha;
    }
}

