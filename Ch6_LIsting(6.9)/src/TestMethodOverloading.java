
public class TestMethodOverloading {

	public static void main(String[] args) {
		// Invoke the max method with int parameters
		System.out.println("The maximum of 3 and 4 is " + max(3, 4));
		
		// Invoke the max method with double parameters
		System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
		
		// Invoke the max method with three double parameters
		System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
		
		// Invoke the max with one integer and one double parameter
		System.out.println("The maximum of 22 and 2.5 is " + max(22, 2.5)); //max(double num1, double num2) is invoked here. 
		
	}
	public static int max(int num1, int num2) {
		if(num1 > num2)
			return num1;
		else
			return num2;
		
	}
	public static double max(double num1, double num2) {
		if(num1 > num2)
			return num1;
		else
			return num2;
		
	}
	public static double max(double num1, double num2, double num3) {
		
		return max((max(num1, num2)), num3);
	}
}
