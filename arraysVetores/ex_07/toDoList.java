package arraysVetores.ex_07;

import java.util.Scanner;

public class toDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. introducao
        System.out.println("--- TODO LIST CLI - BY MICROSOFT ---");
        //2. solicitar quantidade de tarefas
        System.out.println("Quantas tarefas você vai criar?");

        int qtdTarefas = sc.nextInt();
        sc.nextLine();

        String[] tarefas = new String[qtdTarefas];
        //3. preencher cada tarefa individualmente
        for (int i = 0; i < qtdTarefas; i++) {
            System.out.println("Digite a tarefa " + (i + 1) + ": ");

            tarefas[i] = sc.nextLine();

        }

        System.out.println("--- CADASTRO ENCERRADO ---");

        int c = 1;

        System.out.println("HOJE VOCÊ FARÁ AS SEGUINTES TAREFAS: ");

        for (String tarefa : tarefas) {
            System.out.println(c + "- " + tarefa);
            c++;
        }




            sc.close();
    }
}
