package projekat12;
class Frog {
    private String ime;
    private int age;
    private String boja;
    
     
    public void setName(String name) {
        this.ime = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setBoja(String boja) {
        this.boja = boja;
    }
     
    public String getName() {
        return ime;
    }
     
    public int getAge() {
        return age;
    }
    
    public String getBoja() {
        return boja;
    }
    
     
    public void setInfo(String name, int age,String boja) {
        setName(ime);
        setAge(age);
        setBoja(boja);
        
    }
}
 
public class App {
 
    public static void main(String[] args) {
     
        Frog frog1 = new Frog();
        
         
        frog1.setName("ZABAC");
        frog1.setAge(24);
        frog1.setBoja("ZELENE");
        
        Frog frog2 = new Frog();
        frog2.setName("MACA");
        frog2.setAge(3);
        frog2.setBoja("SIVE");
         
        System.out.println("ime mu je "+frog1.getName());
        System.out.println("ima godina "+frog1.getAge());
        System.out.println("boje je "+frog1.getBoja());
        
        System.out.println("ime mu je "+frog2.getName());
        System.out.println("ima godina "+frog2.getAge());
        System.out.println("boje je "+frog2.getBoja());
    }
 
}