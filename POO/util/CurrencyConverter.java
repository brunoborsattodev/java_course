package POO.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double moeda, double taxa) {
        return moeda * taxa * (1 + IOF);
    }
}