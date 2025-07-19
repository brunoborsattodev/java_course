import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(ArquivoConfig.caminhoArquivo()))) {
            String texto;
            while ((texto = br.readLine()) != null) {
                System.out.println(texto);
            }

            String palavra = "MESMO";
            int qtd = WordCount.ContarPalavras(texto.toLowerCase(), palavra.toLowerCase());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}