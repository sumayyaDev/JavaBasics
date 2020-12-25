
public class L1_Task4 {

	public static void main(String[] args) {
		// Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. 
		// Write a program that displays the average speed in miles per hour. 
		// (Note that 1 mile is 1.6 kilometers.)
		double minutes = 45 / 60;
		double seconds = 30 / (60.0 * 60);
		double hours = minutes + seconds;
		double miles = 15 / 1.6;
		
		double milesPerHour = miles / hours; // INFINITY!!
		
		System.out.println("The average speed of the runner is " + milesPerHour + " miles per hour.");

	}

}
