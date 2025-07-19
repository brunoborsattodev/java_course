package io;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //writeFile();
        readFile();

    }

    private static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(ArquivoConfig.PATH + "/exemplo3.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira linha: ");
        String texto1 = sc.nextLine();
        System.out.println("Digite a segunda linha: ");
        String texto2 = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ArquivoConfig.PATH + "/exemplo3.txt"))) {
            bw.write(texto1);
            bw.newLine();
            bw.write(texto2);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}

