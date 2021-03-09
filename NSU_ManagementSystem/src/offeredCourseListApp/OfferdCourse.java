package offeredCourseListApp;

import java.util.Scanner;

public class OfferdCourse {
	private String courseCode;
	private String course1 = "cse115";
	private String course2 = "cse173";
	private String course3 = "cse215";
	private String course4 = "cse225";
	private String course5 = "cse231";
	
	private String course6 = "mat116";
	private String course7 = "mat120";
	private String course8 = "mat125";
	private String course9 = "mat130";
	private String course10= "mat250";
	
	private String course11 = "eng103";
	private String course12 = "phy107";
	private String course13 = "phy108";
	private String course14 = "phi104";
	private String course15 = "ben205";
	
	private String course16 = "eee141";
	private String course17 = "eee452";
	private String course18 = "soc101";
	private String course19 = "his102";
	private String course20 = "pol101";
	
	
	public OfferdCourse() {
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want to see the offered course list(type 1-for YES & 0-for NO): ");
		int decision = in.nextInt();
		if(decision == 1) {
			System.out.println(course1 +"\t"+course2+"\t"+course3+"\t"+course4+"\t"+course5);
			System.out.println(course6 +"\t"+course7+"\t"+course8+"\t"+course9+"\t"+course10);
			System.out.println(course11 +"\t"+course12+"\t"+course13+"\t"+course14+"\t"+course15);
			System.out.println(course16 +"\t"+course17+"\t"+course18+"\t"+course19+"\t"+course20);
		}
	}	
	
	public OfferdCourse(String[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i].toLowerCase().equals(course1) || array[i].toLowerCase().equals(course2) || array[i].toLowerCase().equals(course3) || array[i].toLowerCase().equals(course4) || array[i].toLowerCase().equals(course5) ||
					array[i].toLowerCase().equals(course6) || array[i].toLowerCase().equals(course7) || array[i].toLowerCase().equals(course8) || array[i].toLowerCase().equals(course9) || array[i].toLowerCase().equals(course10) ||
					array[i].toLowerCase().equals(course11) || array[i].toLowerCase().equals(course12) || array[i].toLowerCase().equals(course13) || array[i].toLowerCase().equals(course14) || array[i].toLowerCase().equals(course15) ||
					array[i].toLowerCase().equals(course16) || array[i].toLowerCase().equals(course17) || array[i].toLowerCase().equals(course18) || array[i].toLowerCase().equals(course19) || array[i].toLowerCase().equals(course20))
				
				System.out.println(array[i] + " is available in offered list. You can take this course.");
			else
				System.out.println(array[i] + " is not available in offered list. Sorry! You cannot take this course.");
		}
	}
	
	@Override
	public String toString() {
		return "OfferdCourse [courseCode=" + courseCode + "]";
	}	
}
