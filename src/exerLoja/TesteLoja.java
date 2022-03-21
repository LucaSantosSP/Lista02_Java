package exerLoja;

public class TesteLoja {
	
	public static void main(String[] args) {
		Loja loja = new Loja();
		Livro l1 = new Livro("Moby Dick", Formato.EPUB, true);
		Livro l2 = new Livro("Moby Dick", Formato.PDF, true);
		Livro l3 = new Livro("Filosofia", Formato.FISICO, false);

	
		l1.livroInfo();
		loja.disponibilidade(l1);
		l2.livroInfo();
		loja.disponibilidade(l2);
		l3.livroInfo();
		loja.disponibilidade(l3);

		loja.disponivel(l3);
		l3.livroInfo();
		loja.disponibilidade(l3);
	}
}
