package estrutura_condicional.ternario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos itens você comprou?");

        int qtdItens = sc.nextInt();

        String percentualDesconto = qtdItens > 100 ? "10%" : "5%";

        System.out.println("Desconto de " + percentualDesconto);

        sc.close();
    }
}
