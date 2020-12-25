import java.util.Scanner;
public class LotteryUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    
		// Generate a lottery as a two-digit string
		String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10); // ""+~convert this number into a string
		
		// Prompt the user to enter a guess
		System.out.print("Enter your lottery pick (two digits): ");
		String guess = input.nextLine();
		
		System.out.println("The lottery number is " + lottery);
		
		// Get digits from lottery
		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);
		
		// Get digits from guess
		char guessDigit1 = guess.charAt(0);
		char guessDigit2 = guess.charAt(1);
				
		// Check the guess
		if(guess.equals(lottery))
			System.out.println("Exact match: you win $10,000");
		else if((guessDigit1==lotteryDigit2) && (guessDigit2==lotteryDigit1))
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1==lotteryDigit1 || guessDigit1==lotteryDigit2 
				|| guessDigit2==lotteryDigit1 || guessDigit2==lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry: no match!");			
			
	}

}
