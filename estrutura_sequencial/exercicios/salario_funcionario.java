package estrutura_sequencial.exercicios;

import java.util.Scanner;

public class salario_funcionario {
    public static void main(String[] args) {

//        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais.

        Scanner sc = new Scanner(System.in);
        double num, hrs, valorHr, salario;


        num = sc.nextDouble();
        hrs = sc.nextDouble();
        valorHr = sc.nextDouble();
        salario = hrs * valorHr;
        System.out.println("NUMBER = " + num);
        System.out.println("SALARY = U$ " + salario);
    }
}
