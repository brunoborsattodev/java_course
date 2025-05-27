package POO.override;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Cachorro("Caozin");
        Animal a2 = new Gato("Gatito");
        Animal a3 = new Leao("Lião");

        System.out.print(a1.getNome());
        a1.emitirSom();
        System.out.print(a2.getNome());
        a2.emitirSom();
        System.out.print(a3.getNome());
        a3.emitirSom();
    }
}
