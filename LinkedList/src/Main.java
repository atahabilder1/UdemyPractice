public class Main{


	public static void main(String args[]) {
		// Creating a singly linked list
		SinglyLinkList sLL= new SinglyLinkList();
		sLL.createSinglyLinkedList(5);
		sLL.insertIntoLinkedList(6, 0);
		sLL.insertIntoLinkedList(7, 0);
		sLL.insertIntoLinkedList(8, 0);
		sLL.insertIntoLinkedList(9, 0);
		sLL.insertIntoLinkedList(6, 0);
		sLL.insertIntoLinkedList(6, 0);
		sLL.insertIntoLinkedList(4, 0);
		sLL.insertIntoLinkedList(6, 0);
		sLL.insertIntoLinkedList(5, 0);
		sLL.insertIntoLinkedList(7, 0);
		sLL.insertIntoLinkedList(2, 0);
		sLL.traverseSinglyLinkedList();
		System.out.println();
		sLL.searchInLinkedList(9);
		sLL.deleteFirstFromLinkedList(0);
		sLL.traverseSinglyLinkedList();
		System.out.println();
		 
		sLL.deleteLastFromLinkedList();
		sLL.traverseSinglyLinkedList();
		System.out.println();
		
		sLL.deleteindexedFromLinkedList(3);
		sLL.traverseSinglyLinkedList();
		System.out.println();
		
	}

}