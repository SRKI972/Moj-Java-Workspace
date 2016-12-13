public class App {
	
	public static void main(String[] args) {
		
		// Deklarisanje stringa
		String[] words = new String[3];
		
		// Unos vrijednosti za string
		words[0] = "Pozdrav, ";
		words[1] = "kako si ";
		words[2] = "ti ?";
		
		// Deklarisanje i definisanje stringa istovremeno
		String[] fruits = {"jabuka", "banana", "jagoda", "kivi", "jagoda" };
		
		// Kratka forma FOR petlje 
		// Ovaj dio se radi tek na sljedecim primjerima, za sada ga usvojiti ovakvog
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
			
	}

}