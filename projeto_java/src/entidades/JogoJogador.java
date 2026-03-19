package entidades;

public class JogoJogador {

    private int id;
    private Jogo jogo;
    private Jogador jogador;
    private Rank rank;
    private int pontuacao;
    private int nivel;

    public JogoJogador(int id, Jogo jogo, Jogador jogador, Rank rank, int pontuacao, int nivel) {
        this.id = id;
        this.jogo = jogo;
        this.jogador = jogador;
        this.rank = rank;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

}