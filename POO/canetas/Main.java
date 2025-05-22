package POO.canetas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n### OBJETOS E CLASSES: CRIANDO CANETAS ###");

        Caneta canetaAzul = new Caneta();
        canetaAzul.cor = "Azul";
        canetaAzul.carga = 100;
        canetaAzul.marca = "BIC";
        canetaAzul.ponta = 0.5;
        canetaAzul.tampar();

        Caneta canetaVermelha = new Caneta();

        canetaVermelha.cor = "Vermelha";
        canetaVermelha.carga = 60;
        canetaVermelha.marca = "Faber-Castell";
        canetaVermelha.ponta = 0.1;
        canetaVermelha.tampar();

        canetaAzul.escrever("Ola da caneta azul");
        canetaVermelha.escrever("Ola da caneta vermelha");

        canetaAzul.status();
        canetaVermelha.status();

        sc.close();
    }
}
