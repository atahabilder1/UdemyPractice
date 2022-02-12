package Queue;

import java.util.Arrays;

public class QueueArray {
int arr[];
int topOfQueue;
int beginingofQueue;



public QueueArray(int size) {
	this.arr= new int[size];
	this.topOfQueue=-1;
	this.beginingofQueue=-1;
	System.out.println("A queue has been created with asize "+ size );
}


// IsFull method implementation
public boolean isFull() {
	if(topOfQueue==arr.length) {
		System.out.println("This array is full");
		return true;
	}
	else {
		System.out.println("This array is not full");
		return false;
	}
}
	
	// IsEmpty method implementation
	public boolean isEmpty() {
		if(beginingofQueue==-1) {
			System.out.println("This is an empty queue");
			return true;
		}
		else {
			System.out.println("This queue is not empty");
			return false;
		}
	}
	
	// Enque operation in queue
		public void enque(int value) {
			if (topOfQueue==arr.length) {
				System.out.println("This lis full so you cant enter.");
				return;
			}
			else if (beginingofQueue==-1) {
				arr[++topOfQueue]=value;
				beginingofQueue++;
				System.out.println("this value has bee put in the queue");
				System.out.println(arr[topOfQueue]);
			}
			
			else {
			arr[++topOfQueue]=value;
			System.out.println("this value has bee put in the queue");
			System.out.println(arr[topOfQueue]);
			}
		}
	
	// Deque operation in queue
		public int deque() {
			System.out.println(topOfQueue);
			if(topOfQueue==beginingofQueue) {
				System.out.println("This quue is empty");
				return -1;
			}
			else {
				System.out.println(beginingofQueue);
				int queueValue=arr[beginingofQueue++];
				System.out.println("The value has been dequed:" + queueValue );
				return queueValue;
			}
			
		}
	// Peek method implementaion
		
		public int peek() {
			if (isEmpty()) {
			return -1;	
			}
			else {
				System.out.println("The value peeked is: " + arr[topOfQueue] ) ;
				return arr[topOfQueue];
				
			}
		}
		
		// Delete method implementation
		
		
		//print the queue method
		public void printqueue() {
			
			for (int i=beginingofQueue; i<=topOfQueue; i++) {
				System.out.print(arr[i]+ " ");
			}
			
		}
}
 
