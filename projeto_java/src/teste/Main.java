package teste;

import entidades.Jogador;
import entidades.Rank;

public class Main {

    public static void main(String[] args) {

        Rank rank1 = new Rank("Bronze", 67);

        Jogador jogador1 = new Jogador(
            "Bruno",
            18,
            rank1,
            "Bruninha@email.com",
            "123"
        );

        System.out.println(
            "Nome: " + jogador1.nome +
            " | Rank: " + jogador1.rank.nomeRank +
            " | Pontos: " + jogador1.rank.pontuacaoMinima
        );

    }

}