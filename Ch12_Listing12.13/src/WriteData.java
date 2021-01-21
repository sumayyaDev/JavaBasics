import java.io.*;
import java.util.Scanner;
public class WriteData {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		File file = new File("CricketScore.txt");
		
		if(file.exists()) {
			System.out.println("File already exists.");
			System.exit(1);
		}
		
		PrintWriter output = new PrintWriter(file);
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric k Jones ");
		output.println(85);
		
		output.close();
	}

}
