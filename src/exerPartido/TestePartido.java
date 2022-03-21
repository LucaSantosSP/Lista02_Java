package exerPartido;

public class TestePartido {
	
	public static void main(String[] args) {
		Partido partido = new Partido("Partido 01", "Conservador", 021);
		Partido partido2 = new Partido("Partido 02", "Progressista", 054);
		
		Candidato candidato = new Candidato("João Gomes", partido);
		
		candidato.candidatoInfo();
		
		//--------------
		
		candidato.trocaPartido(partido2);
		candidato.candidatoInfo();
	}
}
