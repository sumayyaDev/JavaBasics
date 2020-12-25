
public class Midterm_2013467642 {

	public static void main(String[] args) {
		
		int numerator;
		int denomenator;
		double sum = 0;
		
		for(int i = 1; i <= 20; i++) {
			numerator = i;
			denomenator = (i+1);
			sum += ((double)numerator/(double)denomenator);
		}
		System.out.println("Sum = " + sum);
	}

}
