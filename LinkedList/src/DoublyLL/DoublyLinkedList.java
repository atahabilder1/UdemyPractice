package DoublyLL;


public class DoublyLinkedList {
	Node head;
	Node tail;
	int size;

	public Node createDoublyLL(int nodeValue) {
		head= new Node();
		Node node = new Node();
		node.next=null;
		node.prev=null;
		node.value=nodeValue;
		head=node;
		tail=node;
		return head;
	}


	public void insertElementInDLL(int value, int location){
		Node node=new Node();
		node.value=value;
		if(node==null) {   // If this is the first element
			createDoublyLL(value);
		}
		else if (location==0) {   // This is insert in the beginning
			System.out.println("This insert is being called");
			node.next=head;
			head.prev=node;
			head=node;
		}
		else if (location>=size) {   // This is insert in the beginning
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
		else {   // this is for specific location
			Node tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
			}
			Node nextNode=tempNode.next;
			tempNode.next=node;
			node.next=nextNode;
			nextNode.prev=node;
			node.prev=tempNode;
		}

	}


	//	Inorder traversal DLL
	public void inorderTraversal() {
		if(head==null) {
			System.out.println("This is empty list");
		}
		else {
			Node tempNode=head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if(i!=size-1) {
					System.out.print ("<-->");
				}
			}
		}
	}

	// Reverse Traversal DLL




}
