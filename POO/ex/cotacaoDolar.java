package POO.ex;

import java.util.Locale;
import java.util.Scanner;
import POO.util.CurrencyConverter;

public class cotacaoDolar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Cotação do dólar: ");
        double cotacao = sc.nextDouble();

        System.out.print("Dólares a comprar: ");
        double dollars = sc.nextDouble();

        System.out.printf("Total: R$ %.2f",
                CurrencyConverter.converter(dollars, cotacao));

        sc.close();
    }
}