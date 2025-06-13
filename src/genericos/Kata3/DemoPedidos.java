package genericos.Kata3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoPedidos {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, LocalDate.of(2023, 5, 10)));
        pedidos.add(new Pedido(2, LocalDate.of(2022, 12, 1)));
        pedidos.add(new Pedido(3, LocalDate.of(2024, 1, 25)));

        System.out.println("📦 Pedidos sin ordenar:");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }

        Collections.sort(pedidos, new ComparadorPedidosPorFecha());

        System.out.println("\n📦 Pedidos ordenados por fecha:");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
}

