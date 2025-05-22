package POO;

public class Conta {
    private double saldo;
    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
