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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "JogoJogador{" +
                "id=" + id +
                ", jogo=" + jogo +
                ", jogador=" + jogador +
                ", rank=" + rank +
                ", pontuacao=" + pontuacao +
                ", nivel=" + nivel +
                '}';
    }

}