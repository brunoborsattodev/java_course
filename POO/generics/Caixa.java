package POO.generics;

public class Caixa <T>{
    private T conteudo;

    public void guardar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T pegar() {
        return this.conteudo;
    }
}
