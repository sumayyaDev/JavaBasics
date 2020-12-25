package newboston46_Static;

public class memberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clubMembers memberObject1 = new clubMembers("Sumayya", "Akter");
		clubMembers memberObject2 = new clubMembers("Bucky", "Roberts");
		clubMembers memberObject3 = new clubMembers("Mosh", "Hamadani");
		clubMembers memberObject4 = new clubMembers("Silvia", "Ahmed");
		
		System.out.println();
		
		System.out.println(memberObject2.getFirstName());
		System.out.println(memberObject2.getLastName());
		System.out.println(memberObject2.getMembers());
		
		System.out.println();
		
		System.out.println(clubMembers.getMembers()); /* We dont need to create object to use static method
											 * like (object.method) when we are accessing into static method.*/
	
	}

}
