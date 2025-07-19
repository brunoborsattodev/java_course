import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //introdução de boas vindas
        System.out.println("### Bem-vindo ao TaskFLow! ###");

        //instanciar classe Tarefa
        GerenciadordeTarefas gerenciadordeTarefas = new GerenciadordeTarefas();

        //começar o loop do programa
        int opcao = 0;
        while (opcao != 6) {

            //mostrar as opções para o usuário
            System.out.println("\nEscolha uma opção: ");
            System.out.println(
                    """
                             1. Adicionar Tarefa\
                            \s
                             2. Remover Tarefa por ID\
                            \s
                             3. Listar Tarefas\
                            \s
                             4. Marcar Tarefa como Concluída\
                            \s
                             5. Procurar Tarefa\
                            \s
                             6. Sair\n >\s""");

            opcao = sc.nextInt();

            // adicionar tarefa

            if (opcao == 1) {

               System.out.println("Digite o ID da tarefa = ");
                String id = sc.nextLine();

                sc.nextLine();

               System.out.println("Digite a tarefa = ");
                String descricao = sc.nextLine();
                gerenciadordeTarefas.adicionarTarefa(id, descricao
                );
            }

            // remover tarefa por ID
            if (opcao == 2) {
                System.out.println("Digite o ID da tarefa que será removida = ");
                gerenciadordeTarefas.removerTarefa(
                        sc.nextLine()
                );

                System.out.println("Tarefa removida!");
            }

            // listar tarefas
            if (opcao == 3) {
                System.out.println("Listando as tarefas...");
                gerenciadordeTarefas.listarTarefas();
            }
            // marcar tarefa como concluída
            if (opcao == 4) {
                System.out.println("Digite o ID da tarefa concluída = ");
                String idconcluido = sc.nextLine();
                gerenciadordeTarefas.concluirTarefa(idconcluido);
                System.out.println("Registrado com sucesso!");
            }
            // procurar tarefa

            // sair
            if (opcao == 6) {
                break;
            }
        }
        sc.close();
    }
}