package POO.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Usuario bruno = new Usuario(
                "Bruno",
                NivelAcesso.ADMIN,
                "guerumi@gmail.com"
        );

        System.out.println("\nSeja bem-vindo(a)!\n");

        bruno.mostrarInfo();

        Usuario maria = new Usuario("Maria", NivelAcesso.CONVIDADO, "maria@.com");

        System.out.println
                ("\nSeja bem-vindo(a)!\n");
        maria.mostrarInfo();

    }
}
