package arraysVetores;

import java.util.Locale;
import java.util.Scanner;

public class produtos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = sc.nextInt();
        String nome = sc.nextLine();
        double preco = sc.nextDouble();

        double[] prod = new double [n];

        for (int i=0;i<n;i++) {
            prod[(int) preco] = sc.nextDouble();
        }


        sc.close();
    }
}
