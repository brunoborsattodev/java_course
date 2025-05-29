package sistemaEmprestimo;

public class Emprestimo extends Pessoa implements SistemaEmprestimo {
    protected double valor;
    protected int numeroParcelas;
    protected int numeroParcelasPagas;
    protected TipoEmprestimo tipo;
    protected int mesesParcelados;
    protected double taxa = 2.5;

    public Emprestimo(String nome, int telefone, String cpf, double valor, int mesesParcelados, TipoEmprestimo tipo) {
        super(nome, telefone, cpf);
        this.valor = valor;
        this.mesesParcelados = mesesParcelados;
        this.tipo = tipo;
    }

    public double valorComTaxa() {
        return this.valor * (1 + taxa / 100);
    }

    public void taxaEmprestimo() {
        if (mesesParcelados > 5) {
            this.valor = valorComTaxa();
        }
    }

    public int getMesesParcelados() {
        return mesesParcelados;
    }

    public double getValor() {
        return valor;
    }

    public int getNumeroParcelas() {
        return this.numeroParcelas;
    }

    public int getNumeroParcelasPagas() {
        return numeroParcelasPagas;
    }

    public void dadosEmprestimo() {

        String valorFormatado = "R$: " + String.format("%.2f", getValor());
        System.out.printf(
                "\n" +
                        "Nome: " + getNome() +
                        "Tipo de Empréstimo: " + tipo.getDescricaoEmprestimo() +
                        "%nValor do Empréstimo: " + valorFormatado +
                        "%nParcelas Restantes: " + getNumeroParcelas() +
                        "%nParcelas Pagas: " + getNumeroParcelasPagas());
    }

    public void quitado() {
        if (this.numeroParcelas != 0) {
            System.out.println("Empréstimo ainda não foi quitado! Faltam: "
                    + getNumeroParcelas()
                    + " parcelas a pagar no valor total de = R$: "
                    + getValor());
        } else {
            System.out.println("Empréstimo quitado!\n");
            this.valor = 0;
        }
    }

    @Override
    public void pagar(double parcelasPagas) {
        this.numeroParcelas -= (int) parcelasPagas;
        this.numeroParcelasPagas += parcelasPagas;
        System.out.println("Pagamento realizado!");
    }

    public void selecionarOpcao(int opcao) {

    }
}