import java.util.*;
import java.io.*;
public class ReadDataFromFile {

	public static void main(String[] args) throws Exception{
		/**
		 * (Write/read data) Write a program to create a file named Exercise12_15.txt 
		 * if it does not exist. Write 100 integers created randomly into the file using text I/O. 
		 * Integers are separated by spaces in the file. 
		 * Read the data back from the file and display the data in increasing order.
		 */
		File file = new File("Exercise12_15.txt");
		if(file.exists()) {
			System.out.println("The file already exists.");
			System.exit(1);
		}
		try(PrintWriter write = new PrintWriter(file);)
		{
			for(int i = 0; i < 100; i++) {
				write.print(((int)(Math.random() * 500) + 1));
				write.print(" ");
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		try(Scanner in = new Scanner(file);)
		{
			while(in.hasNext()) {
				list.add(in.nextInt());
			}
		}
		Collections.sort(list);
		System.out.print(list.toString());
		System.out.println();
	}

}
