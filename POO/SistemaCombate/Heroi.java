package POO.SistemaCombate;

public class Heroi extends Personagem {

    private String classe;
    private int qtdAtaqueEspecial;
    private int qtdPocaovida;
    private String nomeAtaque;

    public Heroi(String nome, int vida, int ataque, int defesa, String classe, int qtdAtaqueEspecial, int qtdPocaovida, String nomeAtaque) {
        super(nome, vida, ataque, defesa);
        this.classe = classe;
        this.qtdAtaqueEspecial = qtdAtaqueEspecial;
        this.qtdPocaovida = qtdPocaovida;
        this.nomeAtaque = nomeAtaque;
    }

    public void usarPocaoVida() {
        System.out.println("Recuperando vida!");
        this.vida += 25;
        this.qtdPocaovida -= 1;
    }

    @Override
    public void mostrarApresentacao() {

        System.out.println(
                this.nome + ": " +
                        "   (Vida: " + this.vida +
                        " , Ataque: " + this.ataque +
                        ", Defesa: " + this.defesa +
                        ", Especial: " + this.qtdAtaqueEspecial +
                        ", Poção de vida: " + this.qtdPocaovida + ")"
        );
    }

    @Override
    public void usarEspecial(Personagem alvo) {
        boolean executarEspecial = this.executaEspecial();
        if (executarEspecial && qtdAtaqueEspecial > 0) {
            int danoEspecial = (int) (this.ataque * 0.1);
            alvo.receberDano(danoEspecial);
            this.qtdAtaqueEspecial--;
            System.out.println(this.nome + "Ataque especial! " + this.nomeAtaque);
        } else {
            System.out.println("Ataque especial falhou!");
        }
    }

}
