package br.soulcode.Aula08_04_Biblioteca;

public class Jogos extends Biblioteca implements MetodosJogos {
	
	public Jogos(int codigo, String nome, String autor) {
		super(codigo, nome, autor);
		this.setValorDoEmprestimoPorDia(5);
	}


	@Override
	public void emprestar(int idade) {
		if( idade < 18 ) {
			throw new RuntimeException("Erro: não é possível realizar o emprestimo pois o cliente é menor de idade");
		}
	}

	@Override
	public double valorEmprestimo(int dias) {
		return this.getValorDoEmprestimoPorDia() * dias;
		
	}
	
	
	
	

}
