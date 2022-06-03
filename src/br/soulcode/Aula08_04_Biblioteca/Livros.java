package br.soulcode.Aula08_04_Biblioteca;

public class Livros extends Biblioteca implements MetodosLivrosEFilmes {
	
	private int numeroExemplaresNoEstoque;

	public Livros(int codigo, String nome, String autor, int numeroExemplaresNoEstoque) {
		super(codigo, nome, autor);
		this.setValorDoEmprestimoPorDia(5);
		this.numeroExemplaresNoEstoque = numeroExemplaresNoEstoque;
		
	}

	public int getNumeroExemplaresNoEstoque() {
		return numeroExemplaresNoEstoque;
	}

	public void setNumeroExemplaresNoEstoque(int numeroExemplares) {
		this.numeroExemplaresNoEstoque = numeroExemplares;
	}

	@Override
	public void emprestar() {
		if ( getNumeroExemplaresNoEstoque() < 2) {
			throw new RuntimeException("Erro: empréstimo não pode ser realizado pois existem menos de 2 exemplares na biblioteca.");
		} else {
			this.setNumeroExemplaresNoEstoque(this.getNumeroExemplaresNoEstoque() - 1);
		}
		
	}

	@Override
	public double valorEmprestimo(int dias) {
		return this.getValorDoEmprestimoPorDia() * dias;
		
	}
	
	

}
