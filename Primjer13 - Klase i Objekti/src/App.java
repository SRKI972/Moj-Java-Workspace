// Naziv klase
class Person {
     
    // Atributi klase
    String name;
    int age;
     
     
    /* Klase mogu sadrzavati
     * - atribute
     * - metode
     */
}
 
// Glavna public klasa se mora zvati kao fajl
public class App {
 
    public static void main(String[] args) {
         
         
        // Kreiramo objekat person1 tipa klase Person
        Person person1 = new Person();  
        person1.name = "Marko Javic";
        person1.age = 37;
         
        // Kreiramo jos jedan objekat tipa klase Person
        Person person2 = new Person();
        person2.name = "Goran Eclipsic";
        person2.age = 20;
         
        System.out.println(person1.name);
         
    }
 
}