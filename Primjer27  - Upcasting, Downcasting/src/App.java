class Machine {
    public void start() {
        System.out.println("Masina je pokrenuta.");
    }
}
 
class Camera extends Machine {
    public void start() {
        System.out.println("Kamera je pokrenuta.");
    }
     
    public void snap() {
        System.out.println("Fotografija je uslikana.");
    }
}
 
 
public class App {
    public static void main(String[] args) {
 
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();
         
        machine1.start();
        camera1.start();
        camera1.snap();
         
        // Upcasting 
        Machine machine2 = camera1;
        machine2.start();
        // error: machine2.snap();
 
        // Downcasting
        // Primjetimo da machine3 inicijalizujemo kao Camera
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();
         
        // Primjetimo da machine4 inicijalizujemo kao Machine
        Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();
        System.out.println(machine4);
    }
 
}