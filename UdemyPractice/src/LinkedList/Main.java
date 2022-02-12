package LinkedList;

import java.util.LinkedList;

public class Main {
	public static void main(String args[]) {
		System.out.println("This is java linked list practice");
		
		
		
		LinkedList<Integer> linkedList= new LinkedList<Integer>();
		System.out.println(linkedList.size());
		linkedList.add(66);
		linkedList.add(55);
		linkedList.add(88);
		linkedList.add(555);
		System.out.println(linkedList);
		linkedList.remove();
		System.out.println(linkedList);
		System.out.println(linkedList.peek());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.pollLast());
		System.out.println(linkedList.pollLast());
		System.out.println(linkedList);
		
		
		
		
		
	}

}
