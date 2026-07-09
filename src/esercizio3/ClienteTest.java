package esercizio3;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente mioCliente = new Cliente();
		System.out.println("Info cliente VestinJava");
		mioCliente.nomeCliente = "Gianfranco Belli";
		mioCliente.dataDiNascita = 38;
		mioCliente.ID = 1234;
		mioCliente.spesaComplessiva = 124.72;
		mioCliente.statoCliente = false;
		mioCliente.displayInfoCliente();
		
		
		
		
		

	}

}
