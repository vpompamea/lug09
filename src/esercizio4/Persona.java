package esercizio4;

public class Persona {
	public String nome;
	public int etaAnni;
	public int etaGiorni;
	public long etaSecondi;
	
	public void calcolaEta() {
		etaGiorni = etaAnni * 365;
		etaSecondi = (long) etaGiorni* 24 * 60 * 60;
		System.out.println("Nome: "+ nome);
		System.out.println("La tua età in anni: "+ etaAnni +" anni.");
		System.out.println("La tua età in giorni: "+ etaGiorni + " giorni.");
		System.out.println("La tua età in secondi: "+ etaSecondi +" secondi.");
	}

}
