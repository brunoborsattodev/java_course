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
        canetaVermelha.tampada = true;
        canetaVermelha.carga = 60;
        canetaVermelha.marca = "Faber-Castell";
        canetaVermelha.ponta = 0.5;
        String tampaVermelha = canetaVermelha.tampada ? "Tampada" : "Destampada";

        System.out.println("\nCaneta " + canetaVermelha.cor +
                " criada!\n" +
                " \nCor: " +
                canetaAzul.cor +
                "\nMarca: " +
                canetaAzul.marca +
                "\n" +
                "Está: " +
                tampaVermelha);

        sc.close();
    }
}
