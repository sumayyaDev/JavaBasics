
import java.util.Scanner;
import java.text.NumberFormat;
public class L1_Task6 {

	public static void main(String[] args) {
		// Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
		// Enter the subtotal and a gratuity rate: 10 15
		// The gratuity is $1.5 and total is $11.5
		Scanner input = new Scanner(System.in);
	    final int PERCENT = 100;
	    
	    System.out.print("Enter the subtotal: ");
	    double subtotal = input.nextDouble();
	    
	    System.out.print("Enter the gratuity rate: ");
	    double rate = input.nextDouble();
	    
	    //String gratuityRate = NumberFormat.getPercentInstance().format(rate);
	    
	    //System.out.println(subtotal + " " + gratuityRate);
	    
	    double gratuity = (rate / PERCENT) * subtotal;
	    double total = subtotal + gratuity;
	    
	    String gratuityCurrency = NumberFormat.getCurrencyInstance().format(gratuity);
	    String totalCurrency = NumberFormat.getCurrencyInstance().format(total);
	    
	    System.out.println("The gratuity is " + gratuityCurrency + " and tatal is " + totalCurrency);
	    
        input.close();
	}

}
      