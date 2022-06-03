package br.soulcode.Aula08_04_Biblioteca;

public class Filmes extends Biblioteca implements MetodosLivrosEFilmes {
	
	private boolean lancadoNoCinema;

	public Filmes(int codigo, String nome, String autor, boolean lancadoNoCinema) {
		super(codigo, nome, autor);
		this.setValorDoEmprestimoPorDia(10);
		this.lancadoNoCinema = lancadoNoCinema;
	}

	public boolean isLancadoNoCinema() {
		return lancadoNoCinema;
	}

	public void setLancadoNoCinema(boolean lancadoNoCinema) {
		this.lancadoNoCinema = lancadoNoCinema;
	}

	@Override
	public void emprestar() {
		if (this.isLancadoNoCinema() == false) {
			throw new RuntimeException("Erro: filme ainda não foi lançado no cinema.");
		}
		
	}

	@Override
	public double valorEmprestimo(int dias) {
		return this.getValorDoEmprestimoPorDia() * dias;
		
	}
	
	

}
