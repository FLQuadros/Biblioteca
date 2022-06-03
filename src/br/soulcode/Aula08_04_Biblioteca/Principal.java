package br.soulcode.Aula08_04_Biblioteca;

public class Principal {

	public static void main(String[] args) {
		
		Jogos j1 = new Jogos(01, "Tomb Raider", "EA");
		Filmes f1 = new Filmes(02, "Harry Potter", "Warner", true);
		Livros l1 = new Livros(03, "Vidas Secas", "Graciliano Ramos", 2);
		
		try {
			j1.emprestar(17);
			System.out.println("Emprestimo realizado!");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			f1.emprestar();
			System.out.println("Emprestimo realizado!");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			l1.emprestar();
			System.out.println("Emprestimo realizado!");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			l1.emprestar();
			System.out.println("Emprestimo realizado!");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("O valor do empréstimo do jogo: " + j1.valorEmprestimo(5));
		System.out.println("O valor do empréstimo do filme: " + f1.valorEmprestimo(10));
		System.out.println("O valor do empréstimo do livro: " + l1.valorEmprestimo(20));
		
		
		
	}

}
