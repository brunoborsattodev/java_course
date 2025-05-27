package POO.veiculos;

import javax.sql.rowset.CachedRowSet;
import java.util.Arrays;

public final class CarroEsportivo extends Carro {
    private int qtdNitro;

    public CarroEsportivo(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas, String tipoCombustivel, int qtdPortas, int qtdNitro) {
        super(marca, anoFabricacao, tipoTerreno, numeroRodas, tipoCombustivel, qtdPortas);
        this.qtdNitro = qtdNitro;
    }



    public void ativarNitro() {
        System.out.println("## Ativando o Nitro ##\n");
        this.qtdNitro = 0;
    }

    public void info() {
        System.out.println(" ");
    }
}
