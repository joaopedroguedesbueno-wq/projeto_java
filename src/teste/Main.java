package teste;

import entidades.Jogador;
import entidades.Rank;
import entidades.Jogo;
import entidades.JogoJogador;

public class Main {

    public static void main(String[] args) {

        // criando um jogador
        Jogador jogador1 = new Jogador(1, "Pedro", 18, "pedro@email.com", "senha123");

        // criando um jogo
        Jogo jogo1 = new Jogo(1, "Minecraft", "Sandbox", "PC", "Mojang", 2011);

        // criando um rank
        Rank rank1 = new Rank(1, "Ouro", 3000);

        // criando jogojogador
        JogoJogador jogoJogador1 = new JogoJogador(
                1,
                jogo1,
                jogador1,
                rank1, 5000, 0
        );

        // mostrando informações
        System.out.println("Jogador: " + jogador1.getNome());
        System.out.println("Jogo: " + jogo1.getNome());
        System.out.println("Pontuação: " + jogoJogador1.getPontuacao());
        System.out.println("Nível: " + jogoJogador1.getNivel());
        System.out.println("Rank: " + rank1.getNomeRank());

    }

}