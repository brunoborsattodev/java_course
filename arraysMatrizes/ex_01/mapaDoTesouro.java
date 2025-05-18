package arraysMatrizes.ex_01;

import java.util.Scanner;

public class mapaDoTesouro {
    public static void main(String[] args) {
        System.out.println("======== MAPA DO TESOURO ========");
        System.out.println("-  0  1  2  ");
        System.out.println("0  *  *  *  ");
        System.out.println("1  *  *  *  ");
        System.out.println("2  *  *  *  ");
        System.out.println("=========================");

        boolean[][] mapaTesouro = new boolean[3][3];

        mapaTesouro[1][2] = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Onde está o tesouro? Digite a linha: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Onde está o tesouro? Digite a coluna: ");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Procurando...");

        if (mapaTesouro[x][y]){
            System.out.println("Achou o tesouro!!");
        } else {
            System.out.println("Você não achou nada! :(");
        }

    }
}
