package estrutura_condicional.ex_while;

import java.util.Scanner;

public class senha_invalida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();
        int correta = 2002;

        while (senha != correta) {
            System.out.println("Senha invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
