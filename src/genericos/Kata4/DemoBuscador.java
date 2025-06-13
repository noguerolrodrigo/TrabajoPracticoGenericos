package genericos.Kata4;

import java.util.ArrayList;
import java.util.List;

class Usuario implements Identificable {
    private int id;
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario #" + id + " - " + nombre;
    }
}

public class DemoBuscador {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "Lucía"));
        usuarios.add(new Usuario(2, "Martín"));
        usuarios.add(new Usuario(3, "Sofía"));

        Usuario encontrado = Buscador.buscarPorId(usuarios, 2);
        if (encontrado != null) {
            System.out.println("🔍 Encontrado: " + encontrado);
        } else {
            System.out.println("❌ Usuario no encontrado.");
        }
    }
}
