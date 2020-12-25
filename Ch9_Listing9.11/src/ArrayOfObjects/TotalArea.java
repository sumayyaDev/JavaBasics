package ArrayOfObjects;

public class TotalArea {

	public static void main(String[] args) {
		// The program creates circleArray, an array composed of five circle objects;
		// It then initialize circle radius with random values and
		// Displays the total area of the circles in the array
		
		// Declare circleArray
		CircleWithPrivateDataFields[] circleArray;
		// Create circleArray
		circleArray = createCircleArray();
		// Print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
		
		
		// Create an array of circle objects
		public static CircleWithPrivateDataFields[] createCircleArray() {
			CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
			
			for(int i = 0; i < circleArray.length; i++) {
				circleArray[i] = new CircleWithPrivateDataFields(Math.random()*100);
			}
			return circleArray;
		}
		
		// Print an array of circles and their total area
		public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
			System.out.printf("%-30s%-15s\n", "Radius", "Area");
			
			for(int i = 0; i < circleArray.length; i++) {
				System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
			}
			System.out.println("--------------------------------------------------");
			// Compute and display the result
			System.out.printf("%-30s%-15s\n", "The total area of circles is ", sum(circleArray));
		}
		
		public static double sum(CircleWithPrivateDataFields[] circleArray) {
			double sum = 0;
			
			for(int i = 0; i < circleArray.length; i++) {
				sum += circleArray[i].getArea();
			}
			return sum;
		}
}
