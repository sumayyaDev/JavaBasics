package newboston_38;

public class displayOutput {

	public static void main(String[] args) {
		// Get access into the desired class creating an object
		ModifyTime modifyTimeObject = new ModifyTime(); // Object created
		
		System.out.println(modifyTimeObject.toMilitary());
		System.out.println(modifyTimeObject.toString());
		
		modifyTimeObject.setTime(13, 27, 6);
		System.out.println(modifyTimeObject.toMilitary());
		System.out.println(modifyTimeObject.toString());
		
	}

}
