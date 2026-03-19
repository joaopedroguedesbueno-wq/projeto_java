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

    public String getNome() {
        return nome;
    }

}