package exerLoja;

public class Livro {
	private String nomeLivro;
	private Formato formato;
	private boolean disponivel;
	
	public Livro(String nomeLivro, Formato formato, boolean disponivel) {
		this.nomeLivro = nomeLivro;
		this.formato = formato;
		this.disponivel = disponivel;
	}
	
	public void livroInfo() {
		System.out.println("Nome do livro: " + nomeLivro);
		if (formato.getDescricao() == "EPUB") {
			System.out.println("Formato do livro: EPUB");
			System.out.println("Preço do livro: R$20.00");
		}
		else if (formato.getDescricao() == "pdf") {
			System.out.println("Formato do livro: pdf");
			System.out.println("Preço do livro: R$40.00");
		}
		else {
			System.out.println("Formato do livro: Físico");
			System.out.println("Preço do livro: R$80.00");
		}
		System.out.println("");
	}
	
	public void alterDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public boolean getDisponibilidade() {
		return disponivel;
	}
	
	public String getNome() {
		return nomeLivro;
	}
	
	public String getFormato() {
		return formato.getDescricao();
	}
}
