package Stack;

public class Stack {
	int[] arr;
	int topOfStack;
	// Constructor for the stuck
	public Stack(int size) {
		this.arr=new int[size];
		this.topOfStack=-1;
		System.out.println("The stack has been creates witha   size of: " +size );
	}
	
	
	// IsEmpty test on the given stack
	public boolean isempty() {
		if(topOfStack==-1) {
			System.out.println("This is empty");
			return true;
		}
		else
			System.out.println("This is not empty");
			return false;
	}

	//isFull method implementation
	public boolean isFull() {
		 if(topOfStack==arr.length-1) {
			 System.out.println("This stack is full");
			 return true;
		 }
		 else {
			 System.out.println("This stack is not full");
			return false;
		}
	}
	// Implementation of push operation
	public void push(int value) {
		if(topOfStack==arr.length-1) {
			System.out.println("This stack is full!");
			int[] arr1=new int[topOfStack*2];
			
			
		}
		else {
			arr[++topOfStack]=value;
		}
	}
	
	//pop operation on stack data structure
	public int pop() {
		if (topOfStack == -1) {
			System.out.println("This stack is empty");
			 return -1;
		}

		else {
			int topValue = arr[topOfStack--];
			return topValue;
		}
		 
	}
	
	
	
}
