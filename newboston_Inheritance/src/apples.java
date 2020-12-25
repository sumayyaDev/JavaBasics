
public class apples {

	public static void main(String[] args) {
		
		food sumu[] = new food[2];
		sumu[0] = new potpie();
		sumu[1] = new tuna();
		
		for(int i = 0; i < 2; i++) {
			sumu[i].eat();
		}
	}

}
