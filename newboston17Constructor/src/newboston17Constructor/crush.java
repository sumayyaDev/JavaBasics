package newboston17Constructor;

public class crush {
	private String manName;
	
	// Building constructor
	public crush(String name) {
		manName = name;
	}
	
	public String getName() {
		return manName;
	}
	
	public void saying() {
		System.out.printf("Your first crush was %s\n", getName());
	}
}
