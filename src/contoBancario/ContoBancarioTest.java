package contoBancario;

public class ContoBancarioTest {

	public static void main(String[] args) {
		// CLIENTE 1
		ContoBancario clienteUno = new ContoBancario();
		clienteUno.nome = "Felicia";
		clienteUno.cognome = "Smith";
		clienteUno.IDcliente = "1234";
		clienteUno.saldo = 420.73; 
		
		clienteUno.infoCliente();
		clienteUno.versamento(100.00);
		
		// CLIENTE 2
		ContoBancario clienteDue = new ContoBancario();
		clienteDue.nome = "Fabio";
		clienteDue.cognome = "Rossi";
		clienteDue.IDcliente = "2345";
		clienteDue.saldo = 652.90;
		
		clienteDue.infoCliente(); 
		clienteDue.prelievo(320.00);
		
		// CLIENTE 3
		ContoBancario clienteTre = new ContoBancario();
		clienteTre.nome = "Gemma";
		clienteTre.cognome = "Russo";
		clienteTre.IDcliente = "7658";
		clienteTre.saldo = 1982.83;
		
		clienteTre.infoCliente(); 
		clienteTre.interesse();     
		clienteTre.versamento(49.90); 
	}
}