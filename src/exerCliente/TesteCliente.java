package exerCliente;

public class TesteCliente {
	public static void main(String[] args) {
		Doc doc = new Doc();
		Cliente c1 = new Cliente("Camila Mendez", 150.92, 200.00);
		Cliente c2 = new Cliente("Pedro Santana", 1250, 800.00);
		
		c2.clienteInfo();
		doc.transferir(c1, c2, 250);
		c2.clienteInfo();
		c1.clienteInfo();

		doc.transferir(c2, c1, 250);
		c2.clienteInfo();
		c1.clienteInfo();
	}
}
