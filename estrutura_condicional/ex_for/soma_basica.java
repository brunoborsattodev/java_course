package estrutura_condicional.ex_for;

import java.util.Scanner;

public class soma_basica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma, N, x, i;

        soma = 0;

        System.out.print("Quantos números irá calcular? = ");
        N = sc.nextInt();
        System.out.printf("Calculando %d números:\n ", N);
        for (i = 0; i < N; i++) {
            System.out.print("Digite os números para somar = ");
            x = sc.nextInt();
            System.out.printf("+ %d \n", x);
            soma += x;

        }
        System.out.println(soma);

        sc.close();
    }
}
