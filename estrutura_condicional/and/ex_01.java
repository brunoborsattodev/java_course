package estrutura_condicional.and;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login = "admin";
        String senha = "secret";

        while (true) { // O 'do' estava mal posicionado. Melhor usar while(true) direto aqui.
            System.out.println("####### SISTEMA DE LOGIN - FBI ########");

            System.out.print("# DIGITE O USUÁRIO = ");
            String inputLogin = sc.nextLine();

            System.out.print("# DIGITE A SENHA = ");
            String inputPass = sc.nextLine();

            // Verifica se login e senha estão corretos
            if (inputLogin.equalsIgnoreCase(login) && inputPass.equalsIgnoreCase(senha)) {
                System.out.println("Acesso Concedido!");
                System.out.println("Liberando os arquivos...");
                break; // Sai do laço quando o login for bem-sucedido
            } else {
                System.out.println();
                System.out.println("####### ALARME ########");
                System.out.println("AGENTES DO FBI A CAMINHO");
                break; // Sai do laço quando o login for mal-sucedido
            }
        }

        sc.close(); // Fecha o Scanner depois que termina o laço
    }
}
