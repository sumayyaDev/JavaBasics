import java.io.*;
import java.util.Scanner;
public class ReadData {

	public static void main(String[] args) throws Exception {
		
		File file = new File("CricketScore.txt");
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) {
			String fn = input.next();
			String mn = input.next();
			String ln = input.next();
			int score = input.nextInt();
			
			System.out.println(fn + " " + mn + " " + score);
		}
		input.close();
	}

}
