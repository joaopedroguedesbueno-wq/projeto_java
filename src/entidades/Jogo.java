package entidades;

public class Jogo {

    private int idJogo;
    private String nome;
    private String genero;
    private String plataforma;
    private String empresa;
    private int ano;

    public Jogo(int idJogo, String nome, String genero, String plataforma, String empresa, int ano) {
        this.idJogo = idJogo;
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.empresa = empresa;
        this.ano = ano;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "idJogo=" + idJogo +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", empresa='" + empresa + '\'' +
                ", ano=" + ano +
                '}';
    }

}