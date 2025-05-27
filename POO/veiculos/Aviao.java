package POO.veiculos;
public final class Aviao extends VeiculoAereo {

    private int numeroTurbinas;

    public Aviao(String marca, int anoFabricacao, int altitudeMaxima, int autonomia, int numeroTurbinas) {
        super(marca, anoFabricacao, altitudeMaxima, autonomia);
        this.numeroTurbinas = numeroTurbinas;
    }

    public void ativarPilotoAutomatico() {
        System.out.println(" PILOTO AUTOMÁTICO ATIVADO! ");
    }
}
