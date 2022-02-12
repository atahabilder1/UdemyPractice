package Stack;

import java.lang.reflect.Array;

public class Main {
	public static void main(String args[]) {
		Stack stack=new Stack(5);
		//stack.push(6);
		//stack.isempty();
		//stack.isFull();
		int x=stack.pop();
		System.out.println("The value has been poped up: " + x);
		 
	}
}
