package POO.cafeteria;

public class Main {
    public static void main(String[] args) {
        DolceGusto maqCafe = new DolceGusto();

        maqCafe.ligar();
        maqCafe.colocarCachimbo();
        maqCafe.selecionarModo(ModoCafe.AMERICANO);

        maqCafe.fazerCafe();

    }

}
