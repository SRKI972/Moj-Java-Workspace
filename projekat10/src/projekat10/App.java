class Student {
     
   
    String ime;
    String prezime;
    String brojindeksa;
  
       
}
 
public class App {

	public static void main(String[] args) {
		Student stud1 = new Student();  
        stud1.ime = "Srdjan";
        stud1.prezime = "Dodig";
        stud1.brojindeksa = "12/98";
        
             
        System.out.println(stud1.ime);
        System.out.println(stud1.prezime);
        System.out.println(stud1.brojindeksa);
		
	}

}