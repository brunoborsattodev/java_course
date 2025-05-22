package POO.sistemaBancario;

public class ContaCorrente {
    private String cpf;
    private String nomeCompleto;
    private double saldo;

    public ContaCorrente(String cpf, String nomeCompleto) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.saldo = 0;

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, ContaCorrente ccDestino) {
        sacar(valor);
        ccDestino.depositar(valor);
        System.out.println("\nTrasferência realizada de " +
                this.nomeCompleto +
                "\npara: " +
                ccDestino.getNomeCompleto() +
                "\nno valor de: R$:" +
                valor);
    }

    public double verSaldo() {
        System.out.println("\nSaldo da conta do " + this.nomeCompleto + " é: R$:" + this.saldo);
        return this.saldo;
    }



}

