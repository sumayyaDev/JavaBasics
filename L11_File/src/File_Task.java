import java.io.*;
import java.util.*;

public class File_Task {

	public static void main(String[] args) throws Exception{
		File file = new File("score.txt");
		if(file.exists()) {
			System.out.println("The file already exists.");
			System.exit(1);
		}
		PrintWriter write = new PrintWriter(file);
		write.print("Jhon Doe ");
		write.println(90);
		write.print("David Adams ");
		write.println(70);
		write.close();
		
		Scanner in = new Scanner(file);
		
		while(in.hasNext()) {
			String fName = in.next();
			String sName = in.next();
			int score = in.nextInt();
			System.out.println(fName + " " + sName + " " + score);
		}
	}

}
 