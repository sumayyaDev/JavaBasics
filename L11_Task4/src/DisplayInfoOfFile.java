import java.util.*;
import java.io.*;
public class DisplayInfoOfFile {

	public static void main(String[] args) throws Exception{
		/**
		 * (Count characters, words, and lines in a file) Write a program that will 
		 * count the number of characters, words, and lines in a file. 
		 * Words are separated by whitespace characters. 
		 * The file name should be passed as a command-line argument, as shown in Figure.
		 * The program displays the number of characters, words, and lines in the given file.
		 */
		
		File file = new File("newboston.java");

		PrintWriter write = new PrintWriter(file);
		write.println("The owner is Bucky Roberts.");
		write.println("He is now 25 years old.");
		write.println("He started teaching programming language at the age of 20.");
		write.close();
		
		int characters = 0;	// Number of character
		int words = 0;	    // Number of words
		int lines = 0;	    // Number of lines	
		
		Scanner in = new Scanner(file);
	
			while(in.hasNext()) {
				lines++;
				String line = in.nextLine();
				String[] wordArray = line.split(" "); 
				characters += line.length();
				words += wordArray.length;
			}
			
			System.out.println("File name: " + file.getName());
			System.out.println("Characters: " + characters);
			System.out.println("Words: " + words);
			System.out.println("Lines: " + lines);
	}

}
