import java.io.*;
import java.util.*;
public class FileWritingReading {

	public static void main(String[] args) throws IOException {
		
		File file = new File("scoreReport.txt");
		
		if(file.exists()) {
			System.out.println("The file already exstis.");
			System.exit(1);
		}
		PrintWriter wr = new PrintWriter(file);
		wr.print("Sakib Al Hasan ");
		wr.println(107);
		wr.print("Mushfiq Ur Rahim ");
		wr.println(100);
		wr.close();
		Scanner in = new Scanner(file);
		while(in.hasNext()) {
			String fn = in.next();
			String mn = in.next();
			String ln = in.next();
			int score = in.nextInt();
			System.out.println(fn + " " + mn + " " + ln + " " + score);
		}
		in.close();
	}
}
