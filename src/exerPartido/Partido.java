package exerPartido;

public class Partido {
	private String nome;
	private String ideologia;
	private int numero;
	
	public Partido(String nome, String ideologia, int numero) {
		this.nome = nome;
		this.ideologia = ideologia;
		this.numero = numero;
	}
	
	public void partidoInfo() {
		System.out.println("Partido: " + nome);
		System.out.println("Ideologia do partido: " + ideologia);
		System.out.println("Número do partido: " + numero);
	}
}
