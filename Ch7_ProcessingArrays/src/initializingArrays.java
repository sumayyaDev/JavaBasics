
public class initializingArrays {

	public static void main(String[] args) {
		// Processing arrays
		//(1) Initializing arrays with user input values
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the size of the array: ");		
		int size = input.nextInt();
		double[] myList = new double[size];
		System.out.print("Enter " + myList.length + " values: ");
		 
		  for(int i = 0; i < myList.length; i++) {
		  
		  myList[i] = input.nextDouble(); 
		   } for(int i = 0; i < myList.length; i++) {
		  System.out.printf("myList[%d] = %.2f\n", i, myList[i]); }
		 
		
		//(2) Initializing arrays with random values between 0.0 and 100.0, but less than 100.0
		  
		   System.out.print("Enter the size of the array: ");		
			int size2 = input.nextInt();
			double[] myList2 = new double[size2];
		  for(int i = 0; i < myList2.length; i++) {
			  myList2[i] = Math.random() * 100; 
			  }
		  for(int i = 0; i < myList2.length; i++) {
		  System.out.printf("myList2[%d] = %.2f\n", i, myList2[i]); }
		 
		
		//(3) Character array, declaring by shorthand notation
		
		  char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
		  System.out.println(city);
		 
		
		// Shorthand notation for declaring an array
		
		  double[] shorthandArray = {1.9, 2.9, 4.2, 8.3};
		for(int i = 0; i < shorthandArray.length; i++) {
		System.out.printf("shorthandArray[%d] = %.2f\n", i, shorthandArray[i]);
		}
	}

}
