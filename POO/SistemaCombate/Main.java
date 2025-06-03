package POO.SistemaCombate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Mostrar menu de heróis disponíveis

        Heroi guerreiro = new Heroi("Guerreiro", 100, 20, 5, "Corpo a Corpo", 1, 1, "Corte giratório!");

        Heroi mago = new Heroi("Mago", 80, 25, 10, "Mágica", 2, 2, "Bola de Fogo!");

        Heroi arqueiro = new Heroi("Arqueiro", 90, 18, 8, "A Distância", 1, 1, "Chuva de Flechas!");


        System.out.println("### OBJETIVO: ### \nELIMINE O DRAGÃO E FUJA DA CAVERNA!\n");


        mostrarApresentacoes(guerreiro, mago, arqueiro);

        // 2. Usuario seleciona o heroi
        System.out.print("\nEscolha seu herói: \n> ");

        int opcao = sc.nextInt();
        System.out.println();

        Heroi heroiSelecionado = selecionarHeroi(opcao,
                guerreiro,
                mago,
                arqueiro);

        // 3. Mostrar o monstro
        Monstro dragao = new Monstro("Dragão", 100, 15, 5, 10, "Chama Ardente!", 0.2);

        System.out.print("Um " + dragao.getnome() + " aparece!");
        dragao.mostrarApresentacao();

        // 4. Começar turnos de combate (loop)
        boolean jogoAcabou = false;
        do {

            // 4.1. Solicitar ação do herói
            turnoHeroi(sc, opcao, heroiSelecionado, dragao);
            jogoAcabou = seDragaoMorto(dragao, jogoAcabou);

            // 4.2. Mostrar as vidas
            exibirVidasTodosPersonagens(heroiSelecionado, dragao);

            // 4.3. Executar o turno do monstro
            dragao.recuperarVida();
            dragao.atacar(heroiSelecionado);

            // 4.4. Mostrar as vidas
            exibirVidasTodosPersonagens(heroiSelecionado, dragao);

            // 4.5. Verificar as vidas e finalizar o jogo se for o caso


            // Caso os personagens tenham vida, voltar pro 4.1
            jogoAcabou = seHeroiMorto(heroiSelecionado, jogoAcabou);
            jogoAcabou = seDragaoMorto(dragao, jogoAcabou);

        } while (!jogoAcabou);

        sc.close();
    }

    private static boolean seHeroiMorto(Heroi heroiSelecionado, boolean jogoAcabou) {
        if (heroiSelecionado.estaMorto()) {
            jogoAcabou = true;
            System.out.println("Você morreu!");
        }
        return jogoAcabou;
    }

    private static boolean seDragaoMorto(Monstro dragao, boolean jogoAcabou) {
        if (dragao.estaMorto()) {
            jogoAcabou = true;
            System.out.println("Você eliminou o dragão!");
        }
        return jogoAcabou;
    }

    private static void exibirVidasTodosPersonagens(Heroi heroiSelecionado, Monstro dragao) {
        heroiSelecionado.mostrarVida();
        dragao.mostrarVida();
    }

    private static void turnoHeroi(Scanner sc, int opcao, Heroi heroiSelecionado, Monstro dragao) {
        System.out.println("\n### Seu turno: ###");
        System.out.println("1. Atacar / 2. Usar habilidade especial / 3. Beber poção de vida \n> ");

        int acao = sc.nextInt();

        switch (opcao) {
            case 1 -> heroiSelecionado.atacar(dragao);
            case 2 -> heroiSelecionado.usarEspecial(dragao);
            case 3 -> heroiSelecionado.usarPocaoVida();
        }
    }

    private static Heroi selecionarHeroi(int opcao,
                                         Heroi guerreiro,
                                         Heroi mago,
                                         Heroi arqueiro) {
        return switch (opcao) {
            case 1 -> guerreiro;
            case 2 -> mago;
            case 3 -> arqueiro;
            default -> null;
        };
    }

    private static void mostrarApresentacoes(Heroi guerreiro, Heroi mago, Heroi arqueiro) {
        System.out.println("Heróis disponíveis:\n");
        System.out.print("1 - ");
        guerreiro.mostrarApresentacao();

        System.out.print("2 - ");
        mago.mostrarApresentacao();

        System.out.print("3 - ");
        arqueiro.mostrarApresentacao();
    }
}
