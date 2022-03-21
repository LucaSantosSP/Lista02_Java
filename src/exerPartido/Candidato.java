package exerPartido;

public class Candidato {
	private String nomeCandidato;
	private Partido partido;
	
	public Candidato(String nomeCandidato, Partido partido) {
		this.nomeCandidato = nomeCandidato;
		this.partido = partido;
	}
	
	public void candidatoInfo() {
		System.out.println("Candidato: " + nomeCandidato);
		partido.partidoInfo();
		System.out.println("");
	}
	
	public void trocaPartido(Partido partido) {
		this.partido = partido;
	}
}
