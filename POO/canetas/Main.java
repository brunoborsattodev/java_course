package POO.canetas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n### OBJETOS E CLASSES: CRIANDO CANETAS ###");

        Caneta canetaAzul = new Caneta();
        canetaAzul.cor = "Azul";
        canetaAzul.tampada = false;
        canetaAzul.carga = 100;
        canetaAzul.marca = "BIC";
        canetaAzul.ponta = 0.5;
        String tampaAzul = canetaAzul.tampada ? "Tampada" : "Destampada";

        System.out.println("\nCaneta " + canetaAzul.cor + " criada!\n" +
                " \nCor: " + canetaAzul.cor + "\nMarca: " + canetaAzul.marca + "\n" +
                "Está: " +
                tampaAzul);

        Caneta canetaVermelha = new Caneta();

        canetaVermelha.cor = "Vermelha";
        canetaVermelha.tampada = false;
        canetaVermelha.carga = 60;
        canetaVermelha.marca = "Faber-Castell";
        canetaVermelha.ponta = 0.5;
        String tampaVermelha = canetaVermelha.tampada ? "Tampada" : "Destampada";

        System.out.println("\nCaneta " + canetaVermelha.cor +
                " criada!\n" +
                " \nCor: " +
                canetaVermelha.cor +
                "\nMarca: " +
                canetaVermelha.marca +
                "\n" +
                "Está: " +
                tampaVermelha);

        System.out.println("\nTampando as canetas...");
        canetaVermelha.tampar();
        canetaAzul.tampar();

        tampaAzul = canetaAzul.tampada ? "Tampada" : "Destampada";
        tampaVermelha = canetaVermelha.tampada ? "Tampada" : "Destampada";


        System.out.println("\nCaneta vermelha: " + tampaVermelha);
        System.out.println("Caneta azul: " + tampaAzul + '\n');

        canetaAzul.escrever("Ola da caneta azul");
        canetaVermelha.escrever("Ola da caneta vermelha");



        sc.close();
    }
}
