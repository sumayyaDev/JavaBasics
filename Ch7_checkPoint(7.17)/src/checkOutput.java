
public class checkOutput {

	public static void main(String[] args) {   
		// TODO Auto-generated method stub     
		int[] list = {1, 2, 3, 4, 5};
		reverse(list);
		for(int i = 0; i < list.length; i++) 
		System.out.print(list[i] + " ");
	}
	public static void reverse(int[] list) {
		int[] newList = new int[list.length];
		
		for(int i = 0; i < list.length; i++) {
			newList[i] = list[list.length - 1];
		}
		list = newList;
	}

}
