package ficha;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class BencaosDoDestino {
    public static void main(String[] args) {
        Map<Integer, Map<String, String>> bencaos = new LinkedHashMap<>();

        // Adicionando todas as 100 bênçãos
        addBencao(bencaos, 1, "Aura da Assimilação Metafísica (Lendária)",
                "Sempre que sofrer dano de um Elemento, causa 5 de dano adicional desse elemento no próximo ataque, cumulativo para cada Elemento diferente.");

        addBencao(bencaos, 2, "Aura da Carne Viva (Comum)",
                "Enquanto não estiver inconsciente, recupera 2 pontos de vida no início de cada turno.");

        addBencao(bencaos, 3, "Aura da Constelação Monocromática (Raro)",
                "Durante o período da noite, o custo de mana para todas as habilidades é reduzido em 2.");

        addBencao(bencaos, 4, "Aura da Coragem Leonina (Comum)",
                "Recebe +2 de bônus em testes para resistir ao efeito de Medo durante o dia.");

        addBencao(bencaos, 5, "Aura da Chuva Refrescante (Comum)",
                "Enquanto estiver sob chuva, recupera 1 ponto de vida no início de cada turno.");

        addBencao(bencaos, 6, "Aura da Cripta (Comum)",
                "Inimigos tem -2 de penalidade em testes de ataque contra você, enquanto houver ao menos 1 cadáver na cena.");

        addBencao(bencaos, 7, "Aura da Estrela de Neutrons (Comum)",
                "Durante a noite, recebe +3 de bônus em testes de Força.");

        addBencao(bencaos, 8, "Aura da Floresta Antiga (Comum)",
                "Inimigos tem -2 de penalidade em testes de percepção para encontrarem você enquanto estiver em ambiente natural.");

        addBencao(bencaos, 9, "Aura da Proteção Enevoada (Comum)",
                "Enquanto não puder ser visto por inimigos, recebe 2 de redução de dano.");

        addBencao(bencaos, 10, "Aura da Vítima (Comum)",
                "Ao receber dano físico de um ataque, recupera 2 pontos de mana.");

        addBencao(bencaos, 11, "Aura do Abutre (Comum)",
                "Recebe +2 de bônus em testes de ataque contra mortos-vivos e causa +2 de dano adicional nesses ataques.");

        addBencao(bencaos, 12, "Aura do Caçador Voraz (Comum)",
                "Causa 2 de dano adicional em seres que já receberam dano na cena.");

        addBencao(bencaos, 13, "Aura do Duelista (Comum)",
                "Recebe +2 de bônus em testes de ataque enquanto lutar contra apenas um inimigo na cena.");

        addBencao(bencaos, 14, "Aura do Escritor de Runas (Comum)",
                "Pode usar habilidades de Runas com uma Ação de Movimento.");

        addBencao(bencaos, 15, "Aura do Guardião (Comum)",
                "Recebe +2 de bônus em testes de ataque com armas de duas mãos.");

        addBencao(bencaos, 16, "Aura do Invasor (Comum)",
                "Causa 3 de dano adicional em ataques contra Feéricos sob efeito mental.");

        addBencao(bencaos, 17, "Aura do Inverno (Comum)",
                "Recebe +2 de bônus em testes para resistir a efeitos ambientais de frio.");

        addBencao(bencaos, 18, "Aura do Limbo Visível (Raro)",
                "Durante a noite, recebe 2 de redução de dano Vazio adicional.");

        addBencao(bencaos, 19, "Aura do Magistrado (Comum)",
                "Todos os ataques mágicos causam 2 de dano adicional.");

        addBencao(bencaos, 20, "Aura do Populista (Comum)",
                "Caso tenha outro ser da mesma raça na cena, recebe +2 de bônus em testes sociais com Presença.");

        addBencao(bencaos, 21, "Aura do Rebelde (Comum)",
                "Recebe +2 de bônus para resistir a efeitos de controle mental.");

        addBencao(bencaos, 22, "Aura do Soldado (Comum)",
                "Usando armadura média ou superior, causa 2 de dano adicional em ataques corpo-a-corpo.");

        addBencao(bencaos, 23, "Aura do Vencedor (Comum)",
                "Recupera 1 ponto de vida ao ser bem sucedido no primeiro teste de uma cena.");

        addBencao(bencaos, 24, "Aura do Vento Impulsionador (Comum)",
                "Causa 3 de dano adicional em ataques à distância contra alvos sem armadura.");

        addBencao(bencaos, 25, "Aura do Vigário (Comum)",
                "Recebe +2 de bônus em testes de Presença para mentir enquanto puder ver o alvo.");

        addBencao(bencaos, 26, "Benção da Aliança Sombria (Comum)",
                "Recebe +2 de bônus para resistir a efeitos de Medo ao ter ao menos mais 1 ser na cena.");

        addBencao(bencaos, 27, "Benção da Alma Presenteada (Lendária)",
                "Recebe uma habilidade de divindade de sua escolha, mesmo não sendo seguidor.");

        addBencao(bencaos, 28, "Benção da Estrela Arcana (Comum)",
                "Recebe 1 de mana máxima adicional por Nível.");

        addBencao(bencaos, 29, "Benção da Gentileza (Comum)",
                "Recupera 2 pontos de vida ao usar habilidade de cura em outro ser.");

        addBencao(bencaos, 30, "Benção da Mente Agilizada (Comum)",
                "Recebe +1 de bônus em todos os testes com Inteligência.");

        addBencao(bencaos, 31, "Benção da Nevasca (Comum)",
                "Habilidades de dano Aquoso causam 2 de dano adicional em cenas com neve/gelo naturais.");

        addBencao(bencaos, 32, "Benção da Preparação (Comum)",
                "Todo dano causado por você é aumentado em 1d4.");

        addBencao(bencaos, 33, "Benção das Espirais Marítimas (Comum)",
                "Habilidades do elemento Aquoso tem custo de mana reduzido em 2.");

        addBencao(bencaos, 34, "Benção da Alma Natural (Comum)",
                "Recebe +2 de bônus em todos os testes para resistir a efeitos ambientais.");

        addBencao(bencaos, 35, "Benção da Cerejeira (Comum)",
                "Ataques corpo-a-corpo causam 3 de dano Aéreo adicional.");

        addBencao(bencaos, 36, "Benção da Defesa Selvagem (Comum)",
                "Recebe +2 de bônus em todos os testes para bloquear ataques ou habilidades.");

        addBencao(bencaos, 37, "Bênção da Insanidade Genial (Comum)",
                "Recebe +2 de bônus em testes de Inteligência para criar e manipular Dispositivos.");

        addBencao(bencaos, 38, "Benção da Inteligência Ametista (Comum)",
                "Recebe +2 de bônus em testes de Inteligência para decifrar textos e linguagens antigas.");

        addBencao(bencaos, 39, "Benção da Quietude (Comum)",
                "Recebe +2 de bônus em todos os testes para ocultar presença.");

        addBencao(bencaos, 40, "Benção da Revolução Inesperada (Comum)",
                "Ao ter resultado extremo em um teste, recupera 2 pontos de vida.");

        addBencao(bencaos, 41, "Benção das Chamas Imortais (Comum)",
                "Recebe 3 de redução de dano Flamejante adicional.");

        addBencao(bencaos, 42, "Benção do Arquimago (Raro)",
                "Recebe 4 afinidades elementais adicionais aleatórias.");

        addBencao(bencaos, 43, "Benção do Caçador de Feras (Comum)",
                "Causa 3 de dano adicional em ataques contra Bestas.");

        addBencao(bencaos, 44, "Benção do Cavaleiro Arcano (Raro)",
                "Ataques desarmados causam 4 de dano Puro adicional.");

        addBencao(bencaos, 45, "Benção do Coração Congelado (Comum)",
                "Recebe 3 de redução de dano Aquoso adicional.");

        addBencao(bencaos, 46, "Benção do Exilado (Comum)",
                "Recebe +2 para resistir a efeitos de ácido, veneno e doenças.");

        addBencao(bencaos, 47, "Benção do Prodígio (Comum)",
                "Recebe +2 de bônus em todos os testes de Inteligência.");

        addBencao(bencaos, 48, "Benção do Sono Revigorante (Comum)",
                "Durante descanso curto, recupera 1 ponto de vida a mais por Nível.");

        addBencao(bencaos, 49, "Benção dos Golpes Trovejantes (Comum)",
                "Ataques desarmados causam 2 de dano Tempestuoso adicional.");

        addBencao(bencaos, 50, "Bênçãos dos Olhos do Julgamento (Comum)",
                "Tem +2 de bônus em todos os testes para identificar mentiras.");

        addBencao(bencaos, 51, "Marca da Lebre (Comum)",
                "Sendo Fauno, recebe 2 de deslocamento adicional em terreno natural.");

        addBencao(bencaos, 52, "Marca da Lua de Sangue (Comum)",
                "Sendo Morto-vivo, ataques causam +2 de dano em Mundanos.");

        addBencao(bencaos, 53, "Marca da Magia Selvagem (Comum)",
                "Com afinidade Puro e Sanguíneo, causa 4 de dano adicional em ataques com armas mágicas.");

        addBencao(bencaos, 54, "Marca do Caçador de Monstros (Comum)",
                "Com pelo menos 1 nível em classe física, causa +2 de dano contra Aberrações.");

        addBencao(bencaos, 55, "Marca do Cavaleiro de Duas Cores (Raro)",
                "Com níveis em classe física ou mestiça, causa +2 de dano contra Infernais e Celestiais.");

        addBencao(bencaos, 56, "Marca do Chaveiro (Comum)",
                "Recebe +2 de bônus em testes para destrancar fechaduras com múltiplas fechaduras na cena.");

        addBencao(bencaos, 57, "Marca do Conselheiro (Comum)",
                "Recebe +2 de bônus em testes sociais com seres da mesma raça e nível superior.");

        addBencao(bencaos, 58, "Marca do Cupido (Comum)",
                "Sendo Celestial, causa 2 de dano Divino adicional em ataques à distância.");

        addBencao(bencaos, 59, "Marca do Desgosto (Comum)",
                "Sendo Aberração, recupera 2 pontos de mana ao falhar em teste social com Presença.");

        addBencao(bencaos, 60, "Marca do Espião (Comum)",
                "Sendo Mundano, recebe +2 de bônus em testes de percepção e investigação durante a noite.");

        addBencao(bencaos, 61, "Marca do Estige (Lendária)",
                "Sendo Morto-vivo, recebe resistência a todos os danos.");

        addBencao(bencaos, 62, "Marca do Guardião da Montanha (Comum)",
                "Recebe +2 de bônus em todos os testes em solo acima das nuvens.");

        addBencao(bencaos, 63, "Marca do Juiz (Raro)",
                "Ao causar dano Divino em alvo que feriu alguém em menos de 24h, causa +5 de dano.");

        addBencao(bencaos, 64, "Marca do Justiceiro Aberrante (Comum)",
                "Sendo Aberração, ataques armados causam 2 de dano adicional.");

        addBencao(bencaos, 65, "Marca do Mercenário (Comum)",
                "Causa 3 de dano adicional em todos os ataques e habilidades após receber 5 Créditos nas últimas 24h.");

        addBencao(bencaos, 66, "Marca do Metamorfo (Comum)",
                "Sendo Fauno, pode usar habilidades de Transformação com Ação de Movimento.");

        addBencao(bencaos, 67, "Marca do Pavão (Comum)",
                "Sendo Fauno, recebe +2 de bônus em testes de Presença contra outros Faunos.");

        addBencao(bencaos, 68, "Marca do Pecado (Comum)",
                "Sendo Infernal, ataques causam +2 de dano em Celestiais.");

        addBencao(bencaos, 69, "Marca do Pesadelo (Comum)",
                "Causa 2 de dano adicional em ataques contra seres adormecidos.");

        addBencao(bencaos, 70, "Marca do Primata (Comum)",
                "Sendo Fauno, recebe 1 metro de deslocamento adicional durante o dia.");

        addBencao(bencaos, 71, "Marca do Prisioneiro (Comum)",
                "Recebe +2 de bônus em ataques contra Mundanos quando acorrentado.");

        addBencao(bencaos, 72, "Marca do Santificado (Comum)",
                "Sendo Celestial, ataques causam 2 de dano Divino adicional contra Infernais.");

        addBencao(bencaos, 73, "Marca do Sobrevivente (Comum)",
                "Sob efeito de regeneração de vida com duração >1 turno, cura 3 de vida adicional.");

        addBencao(bencaos, 74, "Marca do Tecelão Estelar (Comum)",
                "Sendo Celestial, recebe +2 de bônus para criar objetos/estruturas sob luz das estrelas.");

        addBencao(bencaos, 75, "Marca do Tripulante (Comum)",
                "Sendo Mundano, recebe +2 de bônus em testes sociais sobre embarcações.");

        addBencao(bencaos, 76, "Portador da Armadura Quebrada (Comum)",
                "Com vida abaixo da metade, recebe 2 de redução de dano adicional.");

        addBencao(bencaos, 77, "Portador da Casca Ascendida (Comum)",
                "Com pelo menos 5 de redução de dano físico, recebe 2 de redução de dano Divino adicional.");

        addBencao(bencaos, 78, "Portador da Cicatriz Astral (Comum)",
                "Com afinidade Pura, recebe 3 de redução de dano Puro adicional.");

        addBencao(bencaos, 79, "Portador da Escrita Dourada (Comum)",
                "Recebe +2 de bônus para decifrar mensagens encriptadas sob luz solar direta.");

        addBencao(bencaos, 80, "Portador da Força Aquática (Comum)",
                "Causa 2 de dano adicional com armas simples contra seres submersos em água.");

        addBencao(bencaos, 81, "Portador da Mente Brilhante (Comum)",
                "Recebe +2 de bônus em testes de Inteligência fora de combate.");

        addBencao(bencaos, 82, "Portador da Moeda Santificada (Comum)",
                "Sendo seguidor de Divindade, dobra Créditos recebidos de qualquer fonte.");

        addBencao(bencaos, 83, "Portador da Pura Devoção (Comum)",
                "Sendo seguidor de Divindade, recebe 1 habilidade divina adicional.");

        addBencao(bencaos, 84, "Portador da Torrente Canalizada (Comum)",
                "Com mais de 1 ser usando armadura pesada na cena, recebe 3 de redução de dano Tempestuoso adicional.");

        addBencao(bencaos, 85, "Portador das Armas Chamuscadas (Comum)",
                "Com afinidade Flamejante, causa 2 de dano Flamejante adicional em ataques armados.");

        addBencao(bencaos, 86, "Portador das Asas Ocultas (Comum)",
                "Podendo voar, deslocamento de voo aumenta em 2 metros.");

        addBencao(bencaos, 87, "Portador das Células Mortas (Comum)",
                "Ao mudar de uma cena de combate para outra, recupera 3 pontos de vida.");

        addBencao(bencaos, 88, "Portador das Chamas Celestiais (Raro)",
                "Com afinidade Flamejante, também aplica para elemento Divino.");

        addBencao(bencaos, 89, "Portador das Emoções Pulsantes (Comum)",
                "Sendo Infernal ou Celestial, recebe +2 para resistir ao efeito mental de Raiva.");

        addBencao(bencaos, 90, "Portador das Perdas Profundas (Comum)",
                "Com um ser morto na cena, recupera 3 pontos de mana.");

        addBencao(bencaos, 91, "Portador das Rosas Carmesim (Comum)",
                "Sem armadura, seres que atacarem corpo-a-corpo recebem 2 de dano físico de perfuração.");

        addBencao(bencaos, 92, "Portador dos Olhos Dourados (Comum)",
                "Com afinidade Divino, recebe +3 de bônus em testes sociais com Presença.");

        addBencao(bencaos, 93, "Portador do Amanhecer (Comum)",
                "Ataques corpo-a-corpo causam 2 de dano Divino adicional durante a manhã.");

        addBencao(bencaos, 94, "Portador do Código Fonte (Comum)",
                "Recebe +2 de bônus em testes contra Autômatos.");

        addBencao(bencaos, 95, "Portador do Conflito (Comum)",
                "Em combate, recebe +2 de bônus em testes de contra-ataque.");

        addBencao(bencaos, 96, "Portador do Emblema Infernal (Comum)",
                "Com afinidade Sanguíneo, pode usar habilidades de Ritual com Ação de Movimento.");

        addBencao(bencaos, 97, "Portador do Escudo Ancestral (Comum)",
                "Usando escudo, recebe 2 de redução de dano mágico adicional.");

        addBencao(bencaos, 98, "Portador do Espelho Esfumaçado (Lendária)",
                "Pode recuperar qualquer item que já possuiu através de superfícies reflexivas.");

        addBencao(bencaos, 99, "Portador do Sangue Infernal (Raro)",
                "Com afinidade Sanguíneo, também aplica para elemento Flamejante.");

        addBencao(bencaos, 100, "Portador do Sangue Titânico (Comum)",
                "Sendo Mundano, recebe +2 em testes de Vigor.");

        Random random = new Random();

        exibirTodasBencaos(bencaos);

    }


    private static void addBencao(Map<Integer, Map<String, String>> collection,
                                  int numero, String nome, String efeito) {
        Map<String, String> bencao = new LinkedHashMap<>();
        bencao.put("nome", nome);
        bencao.put("efeito", efeito);
        collection.put(numero, bencao);
    }

    private static void exibirTodasBencaos(Map<Integer, Map<String, String>> bencaos) {
        System.out.println("======================");
        System.out.println("BÊNÇÃOS DO DESTINO");
        System.out.println("======================");

        for (int i = 1; i <= 100; i++) {
            Map<String, String> bencao = bencaos.get(i);
            System.out.printf("%n%d. %s%n- Efeito: %s%n",
                    i,
                    bencao.get("nome"),
                    bencao.get("efeito"));
        }
    }
}
