package POO.estadio;

public class JogadorFutebolAmericano extends Jogador {
    private String listaJogadas;
    private int jardasConquistadas;


    public JogadorFutebolAmericano(String nome, int numero, String listaJogadas, int jardasConquistadas) {
        super(nome, numero);
        this.listaJogadas = listaJogadas;
        this.jardasConquistadas = jardasConquistadas;
    }

    public void fazerTouchDown() {
        System.out.println("TOUCH DOOOOWN");
    }

    public void bloquear() {
        System.out.println("BLOQUEANDO");
    }

    public void correrJardas(int jardas) {
        this.jardasConquistadas += jardas;
    }

    @Override
    public String toString() {
        return "JogadorFutebolAmericano{" +
                "listaJogadas='" + listaJogadas + '\'' +
                ", jardasConquistadas=" + jardasConquistadas +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
