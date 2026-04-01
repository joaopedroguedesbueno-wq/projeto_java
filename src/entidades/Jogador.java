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

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "idJogador=" + idJogador +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }

}