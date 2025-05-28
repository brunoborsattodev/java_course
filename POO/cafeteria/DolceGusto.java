package POO.cafeteria;

public class DolceGusto implements MaquinaCafe {

    private boolean ligada;
    private boolean resistenciaLigada;
    private boolean possuiCachimbo;
    private ModoCafe modoCafeSelecionado;
    private int qtdAguaCaldeira;

    @Override
    public void ligar() {
        this.ligada = true;
        System.out.println("LIGANDO CAFETEIRA...");
        // ligar cafeteira
    }

    @Override
    public void desligar() {
        this.ligada = false;
        System.out.println("DESLIGANDO CAFETEIRA...");

        //desliga a maquina de café
    }

    @Override
    public void colocarCachimbo() {
        this.possuiCachimbo = true;
        System.out.println("CACHIMBO INSERIDO");
        //colocar o cachimbo na cafeteira
    }

    @Override
    public void retirarCachimbo() {
        this.possuiCachimbo = false;
        System.out.println("CACHIMBO RETIRADO");
        //retirar o cachimbo na cafeteira
    }

    @Override
    public void selecionarModo(ModoCafe modoCafe) {
        System.out.println("Modo de Café Selecionado: " + modoCafe.getDescricao());
        this.modoCafeSelecionado = modoCafe;
        //seleciona o modo do café que será feito
    }

    @Override
    public void fazerCafe() {
        //fazendo cafe
        if (this.isLigada()) {
            if (this.possuiCachimbo) {
                if (this.modoCafeSelecionado != null) {
                    //pode fazer o café
                    this.injetarAguaCaldeira(300);
                    this.ligarResistencia();
                    System.out.println("Fazendo " +
                            this.modoCafeSelecionado.getDescricao() +
                            "..." +
                            "\nCafé Pronto!"
                    );
                    this.esvaziarCaldeira();
                    this.desligarResistencia();

                } else {
                    System.out.println("Modo de café não selecionado. Tente novamente.");
                }
            } else {
                System.out.println("Dolce Gusto está sem o cachimbo. " +
                        "Por favor insira o cachimbo para fazer o café.");
            }
        } else {
            System.out.println("CAFETEIRA DESLIGADA");
        }
    }

    private boolean isLigada() {
        return this.ligada;
    }

    private void injetarAguaCaldeira(int qtdAguaCaldeira) {
        System.out.println("### INJETANDO ÁGUA NA CALDEIRA... " + qtdAguaCaldeira + "ML ###");
        this.qtdAguaCaldeira = qtdAguaCaldeira;
        System.out.println("...");
        System.out.println("# PRONTO! #");
    }

    private void esvaziarCaldeira() {
        System.out.println("*** ESVAZIANDO " + qtdAguaCaldeira + "ML DE ÁGUA DA CALDEIRA... ***");
        this.qtdAguaCaldeira = 0;
        System.out.println("CALDEIRA VAZIA");
    }

    private void ligarResistencia() {
        this.resistenciaLigada = true;
        System.out.println("*** LIGANDO A RESISTÊNCIA ***");
    }

    private void desligarResistencia() {
        this.resistenciaLigada = false;
        System.out.println("*** DESLIGANDO A RESISTÊNCIA ***\n");
    }
}
