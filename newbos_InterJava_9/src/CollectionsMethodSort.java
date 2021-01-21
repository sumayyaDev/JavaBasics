import java.util.*;
public class CollectionsMethodSort {

	public static void main(String[] args) {
		
		String[] crap = {"Instagram", "WhatsApp", "Facebook", "Twiter", "Tiktok", "Github"};
		List<String> list1 = Arrays.asList(crap);
		
		Collections.sort(list1); // list1 is sorted
		System.out.printf("%s\n", list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.printf("%s\n", list1);
		
		

	}

}
