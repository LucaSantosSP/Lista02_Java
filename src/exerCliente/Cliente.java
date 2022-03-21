package exerCliente;

public class Cliente {
	private String nomeCliente;
	private double saldo;
	private double limite;
	private double checar;
	
	public Cliente(String nomeCliente, double saldo, double limite) {
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public void sacar(double val) {
		if (saldo+limite >= val) {
			saldo = saldo - val;
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar(double val) {
		saldo = saldo + val;
	}
	
	public String getNome() {
		return nomeCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public double checarSaldo() {
		checar = saldo + limite;
		return checar;
	}
	
	public void clienteInfo() {
		System.out.println("Nome: " + nomeCliente);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println("");
	}
}
