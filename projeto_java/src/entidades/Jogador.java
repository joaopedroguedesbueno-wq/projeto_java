package entidades;

public class Jogador {

    private int idJogador;
    private String nome;
    private int idade;
    private String email;
    private String senha;

    public Jogador(int idJogador, String nome, int idade, String email, String senha) {
        this.idJogador = idJogador;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

}