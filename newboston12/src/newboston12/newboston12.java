package newboston12;
import java.util.Scanner;
public class newboston12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Sumayya's age: ");
		int age = input.nextInt();
		
		switch(age) {
		case 1:
			System.out.println("You can crawl.");
			break;
		case 2:
			System.out.println("You can put cute affort for talking.");
			break;
		case 3:
			System.out.println("You can walk.");
			break;
		case 4:
			System.out.println("You can talk and run.");
			break;
		case 5:
			System.out.println("You are being naughty.");
			break;
		case 6:
			System.out.println("You are going scool.");
			break;
		case 7:
			System.out.println("You are cause of your mother's trouble.");
			break;
		case 8:
			System.out.println("You are being your father's problem.");
			break;
		case 9:
			System.out.println("You are doubting on validity of your real parents.");
			break;
		case 10:
			System.out.println("You can never be beloved by anyone.");
			break;
		default :
			System.out.println("Don't think of your present situatio. Accept your destiny no matter how bad it is.Be grateful.\nALHAMDULILLAH");
			break;
		}
	}
}
