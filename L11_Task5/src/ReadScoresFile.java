import java.io.*;
import java.util.*;
public class ReadScoresFile {

	public static void main(String[] args) throws Exception{
		/**
		 * (Process scores in a text file) Suppose that a text file contains an unspecified number of scores separated by blanks. 
		 * Write a program that prompts the user to enter the file, reads the scores from the file and
		 * displays their total and average.
		 */
		Scanner input = new Scanner(System.in);

		File file = new File("scores.txt");
		
		if(file.exists()) {
			System.out.println("The file already exists.");
			System.exit(1);
		}
		PrintWriter write = new PrintWriter(file);
		write.println(70);
		write.println(90);
		write.println(60);
		write.println(80);
		write.close();

		int count = 0; 		// Counts scores
		double total = 0;	// Accumulates total

		try (
			// Create input file
			Scanner inputFile = new Scanner(file);
		) {
			while (inputFile.hasNext()) {
				total += inputFile.nextInt();
				count++;
			}
		}

		// Display results
		System.out.println("File: " + file.getName());
		System.out.println("Total scores: " + total);
		System.out.println("Average scores: " + (total / count));

	}

}
