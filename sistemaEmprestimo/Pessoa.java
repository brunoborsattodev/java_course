package sistemaEmprestimo;

public class Pessoa {
    public String nome;
    public int telefone;
    private int cpf;

    public Pessoa(String nome, int telefone, int cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getCpf() {
        return cpf;
    }
}
