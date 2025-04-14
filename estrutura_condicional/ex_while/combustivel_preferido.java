package estrutura_condicional.ex_while;

import java.util.Scanner;

public class combustivel_preferido {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int opcao,alcool, gasolina, diesel;

    alcool = 0;
    gasolina = 0;
    diesel = 0;

    String msg = "MUITO OBRIGADO!";

    System.out.println("1. Álcool, 2. Gasolina, 3. Diesel, 4. Fim.");
    opcao = sc.nextInt();

    while (opcao != 4) {
        if (opcao == 1) {
            alcool +=1;
            System.out.println("Abasteceu com Álcool!");
            opcao = sc.nextInt();
        } else if (opcao == 2) {
            gasolina +=1;
            System.out.println("Abasteceu com Gasolina!");
            opcao = sc.nextInt();
        } else if (opcao == 3) {
            diesel +=1;
            System.out.println("Abasteceu com Diesel!");
            opcao = sc.nextInt();
        }
    }
        System.out.printf(msg + "\nAlcool: %d \nGasolina: %d \nDiesel: %d", alcool, gasolina, diesel);


    sc.close();
    }
}
