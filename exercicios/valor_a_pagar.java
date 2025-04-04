package exercicios;

import java.util.Scanner;

public class valor_a_pagar {
    public static void main(String[] args) {

//        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Scanner sc = new Scanner(System.in);

        double cod1, num1, valUn1, cod2, num2, total, valUn2;

        cod1 = sc.nextDouble();
        num1 = sc.nextDouble();
        valUn1 = sc.nextDouble();
        cod2 = sc.nextDouble();
        num2 = sc.nextDouble();
        valUn2 = sc.nextDouble();
        total = (num1 * valUn1 + num2 * valUn2);
        System.out.println("VALOR A PAGAR = R$: " + total);

        sc.close();
    }
}
