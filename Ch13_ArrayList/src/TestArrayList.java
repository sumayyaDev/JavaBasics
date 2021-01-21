import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Double> list1 = new ArrayList<>();
		list1.add(1.5);
		list1.add(2.5);
		list1.add(3.5);
		
		ArrayList<Double> list2 = (ArrayList<Double>)list1.clone();  //list2 & list1 points to the different object with same content
		ArrayList<Double> list3 = list1; //list3 & list1 points to the same object, so they have same content
		
		list2.add(4.5); // [1.5, 2.5, 3.5, 4.5]
		list3.remove(1.5); //[2.5, 3.5] = list3 & list1 both because their reference is same so, if one of them is updated, they both are updated
		
		System.out.println("list1 is: " + list1);
		System.out.println("list2 is: " + list2);
		System.out.println("list3 is: " + list3);
	}

}
