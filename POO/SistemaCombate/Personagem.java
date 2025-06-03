package POO.SistemaCombate;

public abstract class Personagem {
    ;
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Personagem alvo) {
        System.out.println("Atacando");
        alvo.receberDano(ataque);
    }

    public void receberDano(int dano) {
        // todo - realizar lógica de defesa com 50/50 chance

        boolean podeDefender = this.executaEspecial();

        int danoReal;

        if (podeDefender) {
            danoReal = dano - this.defesa;
            System.out.println(this.nome + ": Defesa Realizada!");
        }
        this.vida -= dano;
    }

    public boolean estaMorto() {
        return vida <= 0;
    }

    public String getnome() {
        return nome;
    }

    public void mostrarVida() {
        System.out.println(this.nome + " (Vida: " + this.vida + " )");
    }

    public abstract void mostrarApresentacao();

    public abstract void usarEspecial(Personagem alvo);

    public boolean executaEspecial() {
        long umOuDois = Math.round(1 + Math.random());

        if (umOuDois == 1) {
            return false;
        }
        return true;
    }


}
