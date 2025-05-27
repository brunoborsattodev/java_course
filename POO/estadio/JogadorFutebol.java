package POO.estadio;

public class JogadorFutebol extends Jogador {

    protected String peDominante;
    protected int totalGols;

    public JogadorFutebol(String nome, int numero, String peDominante, int totalGols) {
        super(nome, numero);
        this.peDominante = peDominante;
        this.totalGols = totalGols;
    }

    public void driblar() {
        System.out.println("DRIBLANDO!!!");
    }

    public void fazerGol() {
        this.totalGols++;
    }

    @Override
    public String toString() {
        return "JogadorFutebol{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", totalGols=" + totalGols +
                ", peDominante='" + peDominante + '\'' +
                '}';
    }
}
