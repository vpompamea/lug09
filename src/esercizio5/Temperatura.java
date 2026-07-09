package esercizio5;

public class Temperatura {
	public double fahrenheit;
	public double celsius;
	
	public void converti() {
		celsius =(fahrenheit - 32) * 5/9;
		
		System.out.println("Temperatura in fahrenheit: " + fahrenheit + "F°");
		System.out.println("Temperatura in celsius: " + celsius + "C°");
	}

}
