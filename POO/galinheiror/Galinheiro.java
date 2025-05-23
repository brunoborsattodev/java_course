package POO.galinheiror;

import java.time.LocalDateTime;

public class Galinheiro {

    private String nome;
    private int qtdGalinhas;
    private int ovosPorDiaPorGalinha;
    private int valorOvo;
    private LocalDateTime dataHoraCriacao;

    public Galinheiro(String nome,
                      int qtdGalinhas,
                      int ovosPorDiaPorGalinha,
                      int valorOvo) {
        this.nome = nome;
        this.qtdGalinhas = qtdGalinhas;
        this.ovosPorDiaPorGalinha = ovosPorDiaPorGalinha;
        this.valorOvo = valorOvo;
        this.dataHoraCriacao = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdGalinhas() {
        return qtdGalinhas;
    }

    public void setQtdGalinhas(int qtdGalinhas) {
        this.qtdGalinhas = qtdGalinhas;
    }

    public int getOvosPorDiaPorGalinha() {
        return ovosPorDiaPorGalinha;
    }

    public void setOvosPorDiaPorGalinha(int ovosPorDiaPorGalinha) {
        this.ovosPorDiaPorGalinha = ovosPorDiaPorGalinha;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }


    public int calcularProducaoMensal() {
        return this.calcularProducaoDiaria() * 30;
    }

    public int calcularProducaoDiaria() {
        return this.qtdGalinhas * this.ovosPorDiaPorGalinha;
    }

    public int calcularValorOvoDiaria() {
        return this.calcularProducaoDiaria() * valorOvo;
    }
    public int calcularValorOvoMensal() {
        return this.calcularProducaoMensal() * valorOvo;
    }

    public void mostrarInfo() {
        System.out.println("====================");
        System.out.println("GALINHEIRO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade de Galinhas: " + this.qtdGalinhas);
        System.out.print("Quantidade de Ovos por Dia por Galinha: " + this.ovosPorDiaPorGalinha);
                if(this.ovosPorDiaPorGalinha != 1) {
            System.out.println(" ovos.");
        } else System.out.println(" ovo.");;
        System.out.println("Data e Hora da Criação: " + this.dataHoraCriacao);
        System.out.println("Produção Diária: " + this.calcularProducaoDiaria() + " ovos.");
        System.out.println("Valor dos Ovos: " + this.calcularValorOvoDiaria());
        System.out.println("Produção Mensal: " + this.calcularProducaoMensal() + " ovos.");
        System.out.println("Valor dos Ovos: " + this.calcularValorOvoMensal());

    }

}

