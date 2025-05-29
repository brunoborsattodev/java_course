package sistemaEmprestimo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emprestimo bruno = new Emprestimo
                ("Bruno",
                        1191281-2231,
                        "123.943.232-45",
                        100,
                        5,
                        TipoEmprestimo.CONSIGNADO);

        System.out.println("");
        int opcao = -1;
        while (opcao != 0) {

            bruno.dadosEmprestimo();
            System.out.println("");
            System.out.printf("%nMenu:");
            System.out.println("");
            System.out.println("\n1 - Pagar Parcelas");
            System.out.println("\n0 - Sair");
            System.out.print("\nEscolha uma opção: \n");

            opcao = sc.nextInt();

            switch (opcao) {

                case 0 -> System.out.println("Saindo do sistema...");
                case 1 -> {
                    System.out.print("Quantas parcelas deseja pagar? \n");
                    int valor = sc.nextInt();
                    bruno.pagar(valor);
                    bruno.quitado();
                }
                default -> System.out.println("Opção inválida, tente novamente!");
            }
            ;
        }
        System.out.println("");
        bruno.dadosEmprestimo();

    }
}
