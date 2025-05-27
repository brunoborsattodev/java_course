package POO.estadio;

public class JogadorBasquete extends Jogador {
    private int alturaSalto;
    private int totalCestas;

    public JogadorBasquete(String nome, int numero, int alturaSalto, int totalCestas) {
        super(nome, numero);
        this.alturaSalto = alturaSalto;
        this.totalCestas = totalCestas;
    }

    public void arremessar() {
        System.out.println("ARREMESSANDO!!");
    }

    public void fazerEnterrada() {
        System.out.println("PULANDO " + alturaSalto + " METROS!");
        System.out.println("ENTERRADA!");
        this.totalCestas ++;
    }

    @Override
    public String toString() {
        return "JogadorBasquete{" +
                "alturaSalto=" + alturaSalto +
                ", totalCestas=" + totalCestas +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
