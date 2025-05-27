package POO.veiculos;

public abstract class VeiculoTerrestre extends Veiculo {
    protected String tipoTerreno;
    protected int numeroRodas;

    public VeiculoTerrestre(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas) {
        super(marca, anoFabricacao);
        this.tipoTerreno = tipoTerreno;
        this.numeroRodas = numeroRodas;
    }

    public void acelerar() {
        System.out.println("Acelerando...\n");
    }
    public void freiar() {
        System.out.println("Acionando os freios...\n");
    }
}
