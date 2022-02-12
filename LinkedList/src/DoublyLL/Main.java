package DoublyLL;

public class Main {
	public static void main(String args[]) {
		DoublyLinkedList dLL=new DoublyLinkedList();
		dLL.createDoublyLL(7);
		System.out.println(dLL.head.value);
		dLL.insertElementInDLL(2,0);
		dLL.insertElementInDLL(4,0);
		dLL.insertElementInDLL(6,0);
		dLL.insertElementInDLL(8,0);
		dLL.insertElementInDLL(9,0);
		dLL.insertElementInDLL(11,0);
		dLL.insertElementInDLL(14,0);
		dLL.insertElementInDLL(16,0);
		dLL.insertElementInDLL(18,0);
		dLL.insertElementInDLL(21,0);
		dLL.insertElementInDLL(22,0);
		dLL.inorderTraversal();
	}
}