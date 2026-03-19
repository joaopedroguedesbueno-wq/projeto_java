package entidades;

public class Rank {

    private int idRank;
    private String nomeRank;
    private int pontuacaoMinima;

    public Rank(int idRank, String nomeRank, int pontuacaoMinima) {
        this.idRank = idRank;
        this.nomeRank = nomeRank;
        this.pontuacaoMinima = pontuacaoMinima;
    }

    public String getNomeRank() {
        return nomeRank;
    }

}