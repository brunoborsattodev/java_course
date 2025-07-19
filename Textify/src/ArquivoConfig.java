import java.util.Scanner;

public class ArquivoConfig {
    static Scanner sc = new Scanner(System.in);

    public static String caminhoArquivo() {
        System.out.println("Indique o caminho para o arquivo de texto: ");
        return sc.nextLine();
    }

    public static final String PATH = caminhoArquivo();
}
