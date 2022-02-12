package Queue;

import java.util.Stack;

public class Main {
public static void main(String args[]) {
	QueueArray queueArray=new QueueArray(5);
	queueArray.isFull();
	queueArray.isEmpty();
	queueArray.enque(6);
	queueArray.enque(8);
	queueArray.enque(5);
	queueArray.enque(3);
	queueArray.enque(2);
	queueArray.peek();
	queueArray.deque();
	queueArray.printqueue();
	}
}
