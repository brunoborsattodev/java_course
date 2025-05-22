package POO.abstracaoEncapsulamento.cafeteria;

public class DolceGusto implements MaquinaCafe {

    private boolean ligada;
    private boolean resistenciaLigada;
    private boolean possuiCachimbo;
    private ModoCafe modoCafeSelecionado;
    private int qtdAguaCaldeira;

    @Override
    public void ligar() {
        System.out.println("LIGANDO CAFETEIRA...");
        // ligar cafeteira
    }

    @Override
    public void colocarCachimbo() {
        System.out.println("CACHIMBO INSERIDO");
        //colocar o cachimbo na cafeteira
    }

    @Override
    public void retirarCachimbo() {
        System.out.println("CACHIMBO RETIRADO");
        //retirar o cachimbo na cafeteira
    }

    @Override
    public void selecionarModo(ModoCafe modoCafe) {
        System.out.println("Modo de Café Selecionado: " + ModoCafe.getDescricao());
        //seleciona o modo do café que será feito
    }

    @Override
    public void desligar() {
        //desliga a maquina de café
    }

    @Override
    public void fazerCafe() {
        //fazendo cafe
    }

    private void injetarAguaCaldeira() {
        System.out.println("*** INJETANDO ÁGUA NA CALDEIRA...");
    }

    private void esvaziarCaldeira() {
        System.out.println("*** ESVAZIANDO A CALDEIRA...");
    }

    private void ligarResistencia() {
        this.ligada = true;
        System.out.println("*** LIGANDO A RESISTÊNCIA");
    }

    private void desligarResistencia() {
        this.ligada = false;
        System.out.println("*** DESLIGANDO A RESISTÊNCIA");
    }
}
