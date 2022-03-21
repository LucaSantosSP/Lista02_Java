package exerLoja;

public class Loja {
	
	public void disponivel(Livro livro) {
		livro.alterDisponivel(true);
	}
	
	public void indisponivel(Livro livro) {
		livro.alterDisponivel(false);
		livro.getDisponibilidade();
	}
	
	public void disponibilidade(Livro livro) {
		if (livro.getDisponibilidade()) {
			System.out.println(livro.getNome() + " versão " + livro.getFormato() + " está disponível!");
			System.out.println("");
		}
		else {
			System.out.println(livro.getNome() + " versão " + livro.getFormato() + " está indisponível!");
			System.out.println("");
		}
	}
}
