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

    public int getIdRank() {
        return idRank;
    }

    public void setIdRank(int idRank) {
        this.idRank = idRank;
    }

    public String getNomeRank() {
        return nomeRank;
    }

    public void setNomeRank(String nomeRank) {
        this.nomeRank = nomeRank;
    }

    public int getPontuacaoMinima() {
        return pontuacaoMinima;
    }

    public void setPontuacaoMinima(int pontuacaoMinima) {
        this.pontuacaoMinima = pontuacaoMinima;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "idRank=" + idRank +
                ", nomeRank='" + nomeRank + '\'' +
                ", pontuacaoMinima=" + pontuacaoMinima +
                '}';
    }

}