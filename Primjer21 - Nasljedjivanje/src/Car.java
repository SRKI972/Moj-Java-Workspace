public class Car extends Machine {
     
     
    @Override
    public void start() {
        System.out.println("Auto ukljuceno.");
    }
 
    public void wipeWindShield() {
        System.out.println("Brisaci ukljuceni.");
    }
     
    public void showInfo() {
        System.out.println("Naziv auta: " + name);
    }
}