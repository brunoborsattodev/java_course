package POO.livro;

public class Main {
    public static void main(String[] args) {
        Livro hobbit = new Livro("The Hobbit", "Tolkien", 1937);

        hobbit.status();

        Livro crep = new Livro("Crepúsculo", "Stephanie Meyer", 2006);

        crep.status();
    }
}
