package newboston46_Static;

public class clubMembers {
	
	private String first;
	private String last;
	private static int members = 0;
	
	clubMembers(String firstName, String lastName){
		first = firstName;
		last = lastName;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	}
	public String getFirstName() {
		return first;
	}
	public String getLastName() {
		return last;
	}
	public static int getMembers() {
		return members;
	}

}
