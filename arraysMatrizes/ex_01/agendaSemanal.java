package arraysMatrizes.ex_01;

import java.util.Scanner;

public class agendaSemanal {
    public static void main(String[] args) {
        // 1. introdução
        System.out.println("# GOOGLE - AGENDA SEMANAL CLI #");
        // 2. linhas - dias da semana = 5

        // 3. colunas - tarefas de cada dia da semana = 8

        Scanner sc = new Scanner(System.in);

        String[][] agenda = new String[5][8];

        for (int dia = 0; dia < 5; dia++) {
            String diaSemana = switch (dia) {
                case 0 -> "segunda";
                case 1 -> "terça";
                case 2 -> "quarta";
                case 3 -> "quinta";
                case 4 -> "sexta";
                default -> "";
            };

            System.out.println("Quer cadastrar tarefas para " + diaSemana + "?");
            String resp = sc.nextLine();

            if (resp.equalsIgnoreCase("sim")) {
                // solicitar as tarefas
                for (int tarefas = 0; tarefas < 8; tarefas++) {
                    System.out.println("Digite o nome da tarefa " + (tarefas + 1) + "/8 ou 'finalizar': ");

                    String nomeTarefa = sc.nextLine();

                    if (nomeTarefa.equalsIgnoreCase("finalizar")) {
                        break;
                    } else {
                        agenda[dia][tarefas] = nomeTarefa;
                    }
                }
            }
        }
                System.out.println("\nAgenda finalizada!");

                for (int i = 0; i < 5; i++) {
                    String diaSemana = switch (i) {
                        case 0 -> "segunda";
                        case 1 -> "terça";
                        case 2 -> "quarta";
                        case 3 -> "quinta";
                        case 4 -> "sexta";
                        default -> "";
                    };

                    System.out.println("\nAgenda de " + diaSemana + "\n");

                    for (int j = 0; j < 8; j++) {
                        if (agenda[i][j] != null) {
                            System.out.println("-" + agenda[i][j]);
                        }
                    }

                }
    }
}

