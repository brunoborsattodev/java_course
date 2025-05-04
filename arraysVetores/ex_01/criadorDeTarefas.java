package arraysVetores.ex_01;

import java.util.Scanner;

public class criadorDeTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("### LISTA DE TAREFAS ###");

        System.out.print("Quantas tarefas deseja criar? = ");
        int N = sc.nextInt();
        sc.nextLine();

        String[] lista = new String[N];

        for (int i = 0; i < N; i++) {
            System.out.println("DIGITE A TAREFA " + (i+1) + " = ");
            lista[i] = sc.nextLine();
        }

        System.out.println("\n" + N + " TAREFAS CRIADAS COM SUCESSO! \n");

        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + ". " + lista[i]);
        }
        sc.close();
    }
}
