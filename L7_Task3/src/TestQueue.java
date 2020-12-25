
public class TestQueue {

	public static void main(String[] args) {
		/* Write a test program that adds 20 numbers from 1 to 20 into the queue and 
	     * removes these numbers and displays them */  // I have removed the first number but how to display the removal array?
		Queue queue = new Queue();
		
		// Inserting 20 numbers
		for(int i = 0; i < 30; i++) {
			queue.enqueue(i+1);
		}
		
		// Displaying 20 numbers in first-in first-out fasion
		for(int i = 0; i < 20; i++) {
			System.out.printf("%2d ", queue.dequeue());
			if((i+1) % 5 == 0)
				System.out.println();
		}
		for(int i = 0; i < queue.getSize(); i++) {
			System.out.println(queue.elementAt(i));
			
		}
	}

}
