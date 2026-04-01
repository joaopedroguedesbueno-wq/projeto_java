package teste;

import entidades.Jogo;
import entidades.Jogador;
import entidades.Rank;
import entidades.JogoJogador;

/**
 * Classe de testes para validar as entidades do projeto
 */
public class Teste {

    public static void main(String[] args) {
        System.out.println("=== Teste de Entidades ===");
        testJogador();
        testJogo();
        testRank();
        testJogoJogador();
    }

    private static void testJogador() {
        System.out.println("\n--- Teste Jogador ---");
        Jogador jogador = new Jogador(2, "Ana", 22, "ana@email.com", "senha456");
        System.out.println(jogador);
        jogador.setIdade(23);
        System.out.println("Idade atualizada: " + jogador.getIdade());
    }

    private static void testJogo() {
        System.out.println("\n--- Teste Jogo ---");
        Jogo jogo = new Jogo(2, "The Legend of Zelda", "Aventura", "Nintendo Switch", "Nintendo", 2017);
        System.out.println(jogo);
    }

    private static void testRank() {
        System.out.println("\n--- Teste Rank ---");
        Rank rank = new Rank(2, "Prata", 2000);
        System.out.println(rank);
    }

    private static void testJogoJogador() {
        System.out.println("\n--- Teste JogoJogador ---");
        Jogador jogador = new Jogador(3, "Carlos", 25, "carlos@email.com", "senha789");
        Jogo jogo = new Jogo(3, "Fortnite", "Battle Royale", "PC", "Epic Games", 2018);
        Rank rank = new Rank(3, "Bronze", 1000);
        JogoJogador jogoJogador = new JogoJogador(1, jogo, jogador, rank, 1500, 2);
        System.out.println(jogoJogador);
    }

}
