package estrutura_condicional.ternario;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("### BEM-VINDO AO AMAZON GO ###");

            System.out.println("\n" +
                    "Cliente retirou item da prateleira? = ");
            String resp = sc.next().toLowerCase();

            if (resp.equals("s")) {
                System.out.println("ITEM ADICIONADO AO CARRINHO DE COMPRAS\n");
            } else {
                System.out.println("Seu carrinho de compras está vazio!\n");
                break;
            }
        }
            sc.close();

    }
}
