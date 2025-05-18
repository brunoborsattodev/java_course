package arraysMatrizes.ex_01;

import java.util.Arrays;

public class ex_01 {
    public static void main(String[] args) {

        // tipoDeDado[][] nomevariavel = { {valor, valor, valor}, {valor, valor, valor}};
        // tipoDeDado[][] nomeVariavel = new tipoDeDado[tamanho da linha][tamanho da coluna];

        String[][] alfabeto = new String[3][3];

        alfabeto[0][0] = "a";
        alfabeto[0][1] = "b";
        alfabeto[0][2] = "c";

        alfabeto[1][0] = "d";
        alfabeto[1][1] = "e";
        alfabeto[1][2] = "f";

        alfabeto[2][0] = "g";
        alfabeto[2][1] = "h";
        alfabeto[2][2] = "i";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(alfabeto[i][j].toUpperCase());
            }
        }

    }
}
