package POO.generics;

public class Main {
    public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar("Hello World!");

        System.out.println(caixaDeTexto.pegar());

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.guardar(1);
        System.out.println(caixaDeNumero.pegar());
    }
}
