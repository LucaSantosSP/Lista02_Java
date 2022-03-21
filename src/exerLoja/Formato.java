package exerLoja;

public enum Formato {
	EPUB("EPUB"),
	PDF("pdf"),
	FISICO("Físico");
		
	private String descricao; 
		
	Formato(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
