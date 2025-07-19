import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class WordCount {


    ArquivoConfig arquivoConfig;

    public ArquivoConfig getArquivoConfig() {
        return arquivoConfig;
    }

    public static final int ContarPalavras(String texto, String palavra) {
        int contador;
        try (BufferedReader br = new BufferedReader(new FileReader(ArquivoConfig.caminhoArquivo()))) {
            contador = 0;
            while ((texto = br.readLine()) != null) {

                String[] palavras = texto.split("\\s+");

                for (String p : palavras) {
                    if (p.equals(palavra)) {
                        contador++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }

}
