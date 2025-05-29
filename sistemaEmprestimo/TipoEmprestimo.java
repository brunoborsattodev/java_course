package sistemaEmprestimo;

public enum TipoEmprestimo {
    PESSOAL("Empréstimo Pessoal"),
    CONSIGNADO("Empréstimo Consignado"),
    ROTATIVO("Empréstimo Rotativo");

    public String descricao;

    TipoEmprestimo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoEmprestimo() {
        return descricao;
    }

}
