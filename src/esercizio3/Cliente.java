package esercizio3;

public class Cliente {
	public String nomeCliente;
	public int dataDiNascita;
	public int ID;
	public double spesaComplessiva;
	public boolean statoCliente;
	
	public void displayInfoCliente() {
		System.out.println("Nome e Cognome: "+ nomeCliente+".");
		System.out.println("Data di Nascita: "+ dataDiNascita +" anni.");
		System.out.println("ID cliente: "+ ID+".");
		System.out.println("Spesa complessiva del cliente: "+ spesaComplessiva +"€.");
		System.out.println("Nuovo cliente : "+ statoCliente+ ".");
	}
	
	
	

}
