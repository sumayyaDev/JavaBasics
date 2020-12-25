package newboston48_Final;

public class apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalConstant finalObject = new finalConstant(10);
		
		for(int i = 0; i < 5; i++) {
			finalObject.add();
			System.out.println(finalObject.toString());
		}

	}

}
