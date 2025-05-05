package arraysVetores.ex_02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class inventarioArray {
    public static void main(String[] args) {
        // 1. introdução
        System.out.println("\n---- Steam - GESTÃO DE INVENTÁRIOS ----\n");

        // 2. imprimir menu de opções
        System.out.println("1. adicionar item\n" +
                            "2. remover item\n" +
                            "3. sair");

        // 3. iniciar um loop de ciclo de vida da nossa app
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        String[] inventario = {"", "", ""};

        do {
            System.out.println("\n---------\n");

            // 4. mostrar o inventário do usuário

            System.out.println("Seu inventário: " + Arrays.toString(inventario));

            // 5. perguntar o que ele quer fazer

            System.out.println("O quê você quer fazer?");
            opcao = sc.nextInt();
            sc.nextLine();
            int slot;

            // 6. criar inteligencia pra saber se adiciona ou remove itens do inventário

        switch (opcao) {
            case 1:
                //adicionar item
                System.out.println("Em qual slot você quer guardar?");
                slot = sc.nextInt();
                sc.nextLine();
                System.out.println("Qual o nome do item?");
                inventario[slot] = sc.nextLine();
                System.out.println("---------");
                System.out.println("1. adicionar item\n" +
                        "2. remover item\n" +
                        "3. sair");
                break;
            case 2:
                //remover item
                System.out.println("Qual slot você quer remover?");
                slot = sc.nextInt();
                sc.nextLine();
                inventario[slot] = "";
                System.out.println("---------\n");
                System.out.println("1. adicionar item\n" +
                        "2. remover item\n" +
                        "3. sair");
                break;
            case 3:
                //sair
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("opção inválida!");
                break;
        }

        } while (opcao != 3);
    }
}
