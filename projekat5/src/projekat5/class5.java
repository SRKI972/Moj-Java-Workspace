package projekat5;

public class class5 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kreiranje skener objekta
		Scanner input = new Scanner(System.in);
		
		// Output prompt
		System.out.println("Unesite liniju teksta: ");
		// System.out.println("Unesite integer: ");
		
		// Izvrsavanje skenera i arhiviranje rezultata
		String line = input.nextLine();
		// int value = input.nextInt();
		// int value = input.nextDouble();
		
		// Ispis arhiviranog rezultata
		System.out.println("You entered: " + line);
		
		// Svaki skener i citac treba zatvoriti nakon upotrebe (dobra praksa)
		input.close();
			
		/*
		 * Zadatak:
		 * 1 - Napisati program koji omogucava korisniku da unese svoje Ime, Prezime, Godinu rodjenja i pol.
		 *   - Nakon sto korisnik unese trazene podatke ispisati jednu recenicu kojom se ponavlja korisnicki unos.
		 */
	}

}
