/*
 * Standardni primjer upisa u tekstualni fajl
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("test.txt");
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("This is line one.");
			br.newLine();
			br.write("This is line two.");
			br.newLine();
			br.write("Last line.");
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}
	}
}
