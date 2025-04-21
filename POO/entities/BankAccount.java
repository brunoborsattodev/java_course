package POO.entities;

public class BankAccount {
    private int number;
    private String titular;
    private double inicialDeposit;
    private double balance;
    private double deposit;


    public BankAccount() {
    }

    public BankAccount(int number, String titular) {
        this.number = number;
        this.titular = titular;
    }

    public BankAccount(int number, String titular, double inicialDeposit) {
        this.number = number;
        this.titular = titular;
        this.inicialDeposit = inicialDeposit;
    }


    public double getInicialDeposit() {
        return inicialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void saque(double quantiaSacada) {
        balance -= quantiaSacada + 5.0;
    }

    public void deposit(double quantiaDepositada) {
        balance += deposit;
    }
}
