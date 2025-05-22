package POO.canetas;

public class Caneta {
    public String cor;
    public String marca;
    protected Double ponta;
    protected int carga;
    private boolean tampada;

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    protected void escrever(String texto) {
        System.out.println("Escrevendo: " + texto);
    }

    public void status() {
        System.out.println("\n=================");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("=================\n");
    }
}
