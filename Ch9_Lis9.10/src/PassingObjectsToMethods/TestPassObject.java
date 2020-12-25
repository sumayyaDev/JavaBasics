package PassingObjectsToMethods;

public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1); // Radius = 1
		
		// Print areas for radius 1, 2, 3, 4, 5.
		int n = 5;
		printAreas(myCircle , n);
		
		// See myCircle.radius and times
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	// Print a table of areas for radius
	public static void printAreas(CircleWithPrivateDataFields myCrcl, int times) {
		System.out.println("Radius \t\t Area");
		while(times >= 1) {
			System.out.println(myCrcl.getRadius() + "\t\t" + myCrcl.getArea());
			myCrcl.setRadius(myCrcl.getRadius() + 1);
			times--;	
		}
	}

}
