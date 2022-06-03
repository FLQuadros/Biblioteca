package br.soulcode.Aula08_04_Biblioteca;

public abstract class Biblioteca {
	
	private int codigo;
	private String nome;
	private String autor;
	private double valorDoEmprestimoPorDia;
	
	public Biblioteca(int codigo, String nome, String autor) {
		this.codigo = codigo;
		this.nome = nome;
		this.autor = autor;	
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getValorDoEmprestimoPorDia() {
		return valorDoEmprestimoPorDia;
	}

	public void setValorDoEmprestimoPorDia(double valorDoEmprestimoPorDia) {
		this.valorDoEmprestimoPorDia = valorDoEmprestimoPorDia;
	}
	
	
	
	
	
	
	
	

}
