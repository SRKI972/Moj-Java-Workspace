package primjer7;

import java.util.Scanner;

public class primjer7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("ime: ");
		String ime = input.nextLine();
		
		System.out.println("prezime: ");
		String rodjen = input.nextLine();
		
		System.out.println("rodjen: ");
		
		String line = input.nextLine();
		
		System.out.println("You entered: " + line);
		
		
		input.close();
			
	
	}

}
