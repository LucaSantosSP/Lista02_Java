package exerCliente;

public class Doc {
	public void transferir(Cliente c1, Cliente c2, double quantia) {
		if (c1.getSaldo() >= quantia) {
			c2.depositar(quantia);
			c1.sacar(quantia);
			System.out.println("Trasferência realizada!");
			System.out.println("");
		}
		else {
			System.out.println("Saldo insuficiente!");
			System.out.println("");
		}
	}
}
