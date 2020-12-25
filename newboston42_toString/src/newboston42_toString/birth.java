package newboston42_toString;

public class birth {
	private String name;
	private potpie birthday;
	
	public birth(String theName, potpie theDate) {
		name = theName;
		birthday = theDate;
		
	}
	
	public String toString() {
		return String.format("My name is %s and my birthday is %s.", name, birthday);
	}

}
