package exercicios;

import java.util.Scanner;

public class diferenca_produto {
    public static void main(String[]args){

//        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner sc = new Scanner(System.in);
        double A, B, C, D, DIF;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        D = sc.nextDouble();

        DIF = (A * B) - (C * D);

        System.out.println("DIFERENÇA = " + DIF);


        sc.close();

    }
}
