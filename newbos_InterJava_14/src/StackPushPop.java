import java.util.*;
public abstract class StackPushPop {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();  //Stack-->(last in, first out)
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		stack.pop();     //Take away an element from stack(first take away from the top)
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	
	private static void printStack(Stack<String> s) {
		if(s.isEmpty())
			System.out.println("You have nothing in your stack.");
		else
			System.out.printf("%s Top\n", s);
	}
}
