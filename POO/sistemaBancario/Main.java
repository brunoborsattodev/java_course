package POO.sistemaBancario;

public class Main {
    public static void main(String[] args) {
        System.out.println("### BEM VINDO AO SISTEMA BANCÁRIO! ###\n");

        ContaCorrente contaBruno = new ContaCorrente("1323", "Bruno Borsatto da Costa");
        ContaCorrente contaJoao = new ContaCorrente("346", "Joao Henrique");

        contaJoao.depositar(100);
        contaBruno.depositar(20);

        contaBruno.verSaldo();
        contaJoao.verSaldo();

        contaJoao.transferir(50, contaBruno);
        contaBruno.verSaldo();
        contaJoao.verSaldo();
    }
}



