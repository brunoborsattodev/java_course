package POO.SistemaCombate;

public class Monstro extends Personagem {

    private int qtdRegeneracaoVida;
    private String nomePoderEspecial;
    private double multiplicadorDanoEspecial;

    public Monstro(String nome, int vida, int ataque, int defesa,
                   int qtdRegeneracaoVida, String nomePoderEspecial,
                   double multiplicadorDanoEspecial) {
        super(nome, vida, ataque, defesa);
        this.qtdRegeneracaoVida = qtdRegeneracaoVida;
        this.nomePoderEspecial = nomePoderEspecial;
        this.multiplicadorDanoEspecial = multiplicadorDanoEspecial;
    }

    public void recuperarVida() {
        this.vida += qtdRegeneracaoVida;
    }

    @Override
    public void atacar(Personagem alvo) {
        boolean viraAtaqueEspecial = this.executaEspecial();
        if (viraAtaqueEspecial) {
            this.usarEspecial(alvo);

        } else {
            super.atacar(alvo);
        }
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println(
                        "   (Vida: " + this.vida +
                        " , Ataque: " + this.ataque +
                        ", Defesa: " + this.defesa +
                        "Regeneração de Vida: " + this.qtdRegeneracaoVida +
                        "Nome Poder Especial" + this.nomePoderEspecial + ")"
        );
    }

    @Override
    public void usarEspecial(Personagem alvo) {
        boolean executarEspecial = this.executaEspecial();
        if (executarEspecial) {
            int danoEspecial = (int) (this.ataque * this.multiplicadorDanoEspecial);
            alvo.receberDano(danoEspecial);
            System.out.println(this.nome + "Ataque especial! " + this.nomePoderEspecial);
        } else {
            System.out.println("Heróis deram sorte dessa vez!");
        }
    }
}
