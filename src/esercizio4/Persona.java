package esercizio4;

public class Persona {
	public String nome;
	public int anni;
	public int giorni;
	public long secondi;
	
	public void calcolaEta() {
		giorni = anni * 365;
		secondi = (long) giorni* 24 * 60 * 60;
		System.out.println("Nome: "+ nome);
		System.out.println("Età in anni: "+ anni +" anni.");
		System.out.println("Età in giorni: "+ giorni + " giorni.");
		System.out.println("Età in secondi: "+ secondi +" secondi.");
	}

}
