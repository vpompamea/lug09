package contoBancario;

public class ContoBancario {
	public String nome, cognome;
	public String IDcliente;
	public double saldo; 

	public void infoCliente() {
		System.out.println();
		System.out.println("BANCA JAVA");
		System.out.println("Benvenuto/a nella banca JAVA "+ nome +" "+ cognome + ".");
		System.out.println("ID cliente: "+ IDcliente + ".");
		System.out.println("Il tuo saldo attuale: "+ saldo +"€.");
	}
	
	public void versamento(double importo) {
		saldo = saldo + importo; 
		System.out.println("Hai versato: " + importo + "€.");
		System.out.println("Il tuo saldo ora è: " + saldo + "€.");
	}
	
	public void prelievo(double importo) {
		saldo = saldo - importo;
		System.out.println("Hai prelevato: " + importo + "€.");
		System.out.println("Il tuo saldo ora è: " + saldo + "€.");
	}
	
	public void interesse() {
		double importoInteresse = saldo * 0.03; 
		saldo = saldo + importoInteresse; 
		System.out.println("Il tuo interesse del 3%: " + importoInteresse +"€.");
		System.out.println("Il tuo saldo con gli interessi ora è: " + saldo + "€.");
	}
}