package entidades;

public class Jogador{
	public String nome;
	public int idade;
	public Rank rank;
	public String email;
	public String senha;
	
	public Jogador(String nome, int idade, Rank rank, String email, String senha) {
		this.nome = nome;
		this.idade = idade;
		this.rank = rank;
		this.email = email;
		this.senha = senha;
	}
	}