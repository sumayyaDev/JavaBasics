
import java.util.Scanner;
public class L2_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int day = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsedDay = input.nextInt();
		
		System.out.print("Today is ");
		switch(day) {
		case 0: System.out.print("Sunday ");
		break;
		case 1: System.out.print("Monday ");
		break;
		case 2: System.out.print("Tuesday ");
		break;
		case 3: System.out.print("Wednesday ");
		break;
		case 4: System.out.print("Thurseday ");
		break;
		case 5: System.out.print("Friday ");
		break;
		case 6: System.out.print("Saturday ");
		break;
		default: System.out.print("Invalid input(Input an integer from 0 t0 6:\n If sunday give 0, Monday 1, Tuesday 2, Wednesday 3, Thurseday 4, Friday 5 & for Saturday 6)");
		}
		System.out.print("and the future day is ");
		int futureDay = (day + elapsedDay) % 7;
		switch(futureDay) {
		case 0: System.out.print("Sunday ");
		break;
		case 1: System.out.print("Monday ");
		break;
		case 2: System.out.print("Tuesday ");
		break;
		case 3: System.out.print("Wednesday ");
		break;
		case 4: System.out.print("Thurseday ");
		break;
		case 5: System.out.print("Friday ");
		break;
		case 6: System.out.print("Saturday ");
		break;
		default: System.out.print("Invalid");
		}

	}

}
