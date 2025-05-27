package POO.override;

public abstract class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome + ": ";
    }

    public void emitirSom() {
        System.out.println("Som genérico");
    }
}
