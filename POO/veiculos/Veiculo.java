package POO.veiculos;

public abstract class Veiculo {
    protected String marca;
    protected int anoFabricacao;

    public Veiculo(String marca, int anoFabricacao) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public void ligar() {
        System.out.println("Ligando...\n");

    }
    public void desligar() {
        System.out.println("Desligando...\n");
    }

}
