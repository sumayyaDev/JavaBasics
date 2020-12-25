
import java.util.Scanner;
public class L2_Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int me = input.nextInt();
		int computer = (int) Math.round(Math.random() * 2);
		
		System.out.print("The computer is ");
		switch(computer) {
		case 0 : System.out.print("scissor.");
		break;
		case 1 : System.out.print("rock.");
		break;
		case 2 : System.out.print("paper.");
		break;
		default : System.out.print("Invalid. Computer could't generate an integer number from 0 to 2.");
		}
		System.out.print("You are ");
		switch(me) {
		case 0 : System.out.print("scissor");
		break;
		case 1 : System.out.print("rock");
		break;
		case 2 : System.out.print("paper");
		break;
		default : System.out.print("Invalid input. Input 0 or 1 or 2.");
		}
		if(me == computer)
			System.out.print(" too.It is a draw.");
		else if((me==0 && computer==2) || (me==1 && computer==0) || (me==2 && computer==1))
			System.out.print(".You won.");
		else
			System.out.print(".Computer won.");
	}

}
