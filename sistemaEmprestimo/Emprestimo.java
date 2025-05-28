package sistemaEmprestimo;

public class Emprestimo extends Pessoa {
    protected double valor;
    protected int numeroParcelas;
    protected int numeroParcelasPagas;

    public Emprestimo(String nome, int telefone, int cpf, double valor, int numeroParcelas, int numeroParcelasPagas) {
        super(nome, telefone, cpf);
        this.valor = valor;
        this.numeroParcelas = numeroParcelas;
        this.numeroParcelasPagas = numeroParcelasPagas;
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

    public void pagar(double parcelasPagas) {
        this.numeroParcelas -= parcelasPagas;
        this.numeroParcelasPagas += parcelasPagas;
        System.out.println("Pagamento realizado!");
    }
}


