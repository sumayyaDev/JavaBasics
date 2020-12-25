
import java.util.Scanner;
public class L2_Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = -1;
		int count = 0;
		int positive = 0;
		int negative = 0;
		int total = 0;
		float average; 
		System.out.println("Enter an integer, the input ends if it is 0: ");
		while(number != 0) {
			number = input.nextInt();
			    count++;
			    total = total + number;
			if(number > 0) {
				positive++; 
			}
			else if(number < 0) {
				negative++;
			}
		}
        average =((float) total) / (count-1);
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negative is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
        input.close();
	}

}
