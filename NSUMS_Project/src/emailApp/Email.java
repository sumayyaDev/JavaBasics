package emailApp;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String email;
	private String emailSuffix = "northsouth.edu";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Your password is: " + this.password);
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + emailSuffix;
		//System.out.println("Your email is: " + email);
	}
	
	
	// Generate a random a password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%!";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public String toString() {
		return "\n"+ firstName + " " + lastName + 
				"\nYour email is: " + email +
				"\nemail password is: "+ password;			
	}
	
}
