package arraysVetores.ex_01;

import java.util.Arrays;
import java.util.Scanner;

public class arrayDeTarefas {
    public static void main(String[] args) {

        // tipoDeDado[] nomeVariavel = {valor, valor, valor};
        // tipoDeDado[] nomeVariavel = new tipoDeDado [tamanho do vetor "ou variável que determine esse tamanho posteriormente"];

        Scanner sc = new Scanner(System.in);

        System.out.println("--- LISTA DE TAREFAS ---");
        System.out.println("Quantas tarefas deseja criar?");

        int qtdTarefas = sc.nextInt();
        sc.nextLine();

        String[] tarefas = new String[qtdTarefas];

        for (int c = 0; c < qtdTarefas; c++) {

            System.out.println("Digite a tarefa " + (c + 1) + ": ");

            tarefas[c] = sc.nextLine();
        }

        System.out.println("Sua lista de tarefas cadastradas é: ");
        System.out.println(Arrays.toString(tarefas));

        sc.close();
    }
}
