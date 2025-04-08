package estrutura_condicional;

import java.util.Scanner;

public class dias_semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String dia;

        x = sc.nextInt();
        dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sábado";

            default -> "opção inválida";
        };
        System.out.println("dia da semana: " + dia);
        sc.close();
    }
}

