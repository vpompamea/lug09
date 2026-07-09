package tricks;

public class MetodiStringhe {

	public static void main(String[] args) {
		String nome = " VERO ".trim(); //toglie gli spazi all'inizio e alla fine
		System.out.println(nome);
		
		String nomeCognome = nome + " POMPAMEA".toLowerCase(); //rende il cognome minuscolo
		System.out.println(nomeCognome);
		
		String laStringa = "Hello world!";
		System.out.println(laStringa);
		int lunghezzaStringa = laStringa.length(); //recupera e salva la lunghezza della stringa
		System.out.println("Lunghezza stringa: "+ lunghezzaStringa);
		String parziale = laStringa.substring(6); //estrae e salva l string in oggetto a partire dal 6°
		//le posizioni dei caratteri partono da 0
		System.out.println("Stringa parziale: " + parziale);
		boolean finisceCon = laStringa.endsWith("!"); // verifico se la Stringa termina con "!".
		System.out.println(finisceCon);
		

	}

}
