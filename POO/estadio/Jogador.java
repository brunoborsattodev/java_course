package POO.estadio;

public class Jogador {

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    protected String nome;
    protected int numero;

    public void treinar() {
        System.out.println("Treinando!");

    }
}
