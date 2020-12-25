package newboston16CrushName;

public class crush {
	private String crushName;
	
	public  void setName(String name) {
		
		crushName = name;
	}
	
	public String getName(){
		
		return crushName;
	}
	
	public void saying() {
		
		System.out.printf("Your first crush was %s ", getName());
	}

}
