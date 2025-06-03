package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        opcao = sc.nextInt();
        String apresentacao = switch (opcao) {
            case 1 -> "O guerreiro aparece!";
            case 2 -> "O mago aparece!";
            case 3 -> "O arqueiro aparece!";
            default -> "Opção inválida";
        };

    }
}
