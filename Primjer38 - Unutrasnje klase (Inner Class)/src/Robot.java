/*
 * Primjer klase Robot koja unutar sebe sadrzi unutrasnje klase (Inner Class) Brain i Battery
 */
public class Robot {
	
	private int id;
	
	// U slucajevima kada zelimo grupisati funkcionalnost
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " trenutno razmislja.");
		}
	}
	
	// Staticke unutrasnje klase, kada zelimo napraviti aktivnost koja nije vezana za instance
	static class Battery {
		public void charge() {
			System.out.println("Baterija se puni...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Pokretanje robota " + id);
		
		Brain brain = new Brain();
		brain.think();
	}
}
