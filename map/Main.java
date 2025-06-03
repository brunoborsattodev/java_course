package map;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> mapaFrutas = new HashMap<>();
        mapaFrutas.put("U", "Uva");
        mapaFrutas.put("B", "Banana");
        mapaFrutas.put("M", "Maçã");

        System.out.println(mapaFrutas);

        //buscando item do mapa por chave
        System.out.println(mapaFrutas.get("B"));

        //remover item do mapa
        mapaFrutas.remove("U");

        System.out.println(mapaFrutas);

        //listar todos os valores do mapa
        String mapa = mapaFrutas.values().toString();

        System.out.println(mapa.strip());

        String a = sc.nextLine();
        String b = sc.nextLine();

        mapaFrutas.put(a, b);

        mapa = mapaFrutas.values().toString();

        if (mapaFrutas.containsKey("O")) {
        System.out.println(mapa);
        } else {
            System.out.println("Não contém O!");
        }

        sc.close();
    }
}
