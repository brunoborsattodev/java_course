package sistemaEmprestimo;

public class Pessoa {
    public String nome;
    public int telefone;
    private String cpf;

    public Pessoa(String nome, int telefone, String cpf) {
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

    public String getCpf() {
        return cpf;
    }
}
