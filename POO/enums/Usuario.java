package POO.enums;

public class Usuario {
    private String nome;
    private NivelAcesso nivelAcesso;
    private String email;

    public Usuario(String nome,
                   NivelAcesso nivelAcesso,
                   String email) {

        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
        this.email = email;

    }

    public NivelAcesso getNivelAcesso() {
        return this.nivelAcesso;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void mostrarInfo() {
        System.out.println("==============");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("NivelAcesso: " + this.nivelAcesso.getDescricao());
        System.out.println("==============");
    }
}
