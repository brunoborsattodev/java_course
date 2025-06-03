package POO.ex;

import POO.entities.BankAccount;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class conta_bancaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        BankAccount conta = new BankAccount();

        System.out.print("Insira o número da conta: ");
        int number = sc.nextInt();
        System.out.println("Insira o classe do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        conta.setTitular(titular);

        System.out.println();
        System.out.printf("NOVA CONTA CRIADA\n NUMERO: %d\n SEJA BEM-VINDO(A): %s\n", number, titular);

        System.out.println("Deseja fazer um depósito inicial? (s/n)");
        char opcao = sc.next().charAt(0);
        if (opcao == 's') {
            System.out.print("Qual o valor? = ");
            double inicialDeposit = sc.nextDouble();

            conta = new BankAccount(number, titular, inicialDeposit);
            System.out.println("Você depositou: R$ = " + conta.getInicialDeposit());
        } else {
            conta = new BankAccount(number, titular);
        }

        System.out.println("O QUÊ DESEJA FAZER?\n- 1 (Depósito)\n-2 (Saque)\n-3 (Sair)");
        int selecao = sc.nextInt();

        while(selecao != 3) {
            if (selecao == 1) {
                System.out.print("Digite o valor do depósito = \n");
                double quantiaDepositada = sc.nextDouble();
                conta.deposit(quantiaDepositada);
                System.out.println("SALDO ATUAL: R$ = " + conta.getBalance());
            } else if (selecao == 2) {
                System.out.print("Digite o valor do saque = \n");
                double quantiaSacada = sc.nextDouble();
                conta.saque(quantiaSacada);
                System.out.println("SALDO ATUAL: R$ = " + conta.getBalance());
                System.out.print("O QUÊ DESEJA FAZER?\n- 1 (Depósito)\n-2 (Saque)\n -3 (Sair)");
                selecao = sc.nextInt();
            }

        }
        sc.close();
    }
}
