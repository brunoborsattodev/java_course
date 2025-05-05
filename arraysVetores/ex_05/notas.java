package arraysVetores.ex_05;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (tipoDado nomeVariavel : vetor) { ... }

        String[] alfabeto = new String[5];
        alfabeto[0] = "A";
        alfabeto[1] = "B";
        alfabeto[2] = "C";
        alfabeto[3] = "D";
        alfabeto[4] = "E\n" +
                "------------" +
                      "\n";

        for (String item : alfabeto) {
            System.out.println(item);
        }

        int[] numeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int item : numeros) {
            // ...
            System.out.println(item);
        }

        sc.close();
    }
}
