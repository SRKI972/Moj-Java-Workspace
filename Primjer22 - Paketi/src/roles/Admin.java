package roles;

public class Admin extends User {
	
	public void login() {
		System.out.println("Administrator prijavljen na sistem");
	}
	
	public void logout() {
		System.out.println("Administrator odjavljen sa sistema");
	}

}
