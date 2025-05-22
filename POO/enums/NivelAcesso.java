package POO.enums;

public enum NivelAcesso {

    ADMIN("Administrador do sistema"),
    USUARIO("Usuario do sistema"),
    CONVIDADO("Convidado do sistema");

    private String descricao;

    NivelAcesso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
