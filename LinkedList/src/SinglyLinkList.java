 

public class SinglyLinkList{
	 public Node head;
	 public Node tail;
	 public int size;
	 // creating a sinlgly linked list
	 
	 public Node createSinglyLinkedList(int nodevalue) {
		 head=new Node(); // why is this code?
		
		 Node node = new Node();
		 node.next=null;
		 node.value=nodevalue;
		 head=node;
		 tail=node;
		 size=1;
		 return head;
		 
	 }
	 
	 // Inserting element in singly linked list
	 public void insertIntoLinkedList(int nodeValue, int location) {
			Node node = new Node();
			node.value=nodeValue;
			if(node==null) {
				createSinglyLinkedList(nodeValue); // if it was empty.
			}
			else if (location==0) { // This is insert in the begining
				node.next=head;
				head=node;
				 
			}
			else if (location>=size) { // this is insert in the  last
				node.next=null;
				tail.next=node;
				tail=node;
			}
			
			else {  // this is in speific location
				Node tempNode=head;
				int index =0;
				while(index<location-1) {
					index++;
				}
			 Node nextNode=tempNode.next;
			 tempNode.next=node;
			 node.next=nextNode;
			}
			size++;
		}
	 
	 
	 public void traverseSinglyLinkedList() {
	 // Trave
	 if(head==null){
		 System.out.println("This is an empty list");
	 }
	 else{
		Node tempNode= head;
		for (int i = 0; i < size; i++) {
			System.out.print(tempNode.value + " ");
			if(i!=size-1) {
				System.out.print ("-->");
			}
			tempNode=tempNode.next;
		}
		
	 }
	 }
	 // Search in singly linkedList
	 public boolean searchInLinkedList(int value) {
		 if(head!=null) {
			Node temoNode= head; 
			for (int i = 0; i < size; i++) {
				if(temoNode.value==value) {
					System.out.println("The value has been found in the location: " + i);
					return true;
					
				}
				temoNode=temoNode.next;
			}
			System.out.println("the node doesnt exists");
			
		 }
		 return false;
	 }
	 
	 
	 
	 // Delete from first element linkedList
	 public void deleteFirstFromLinkedList(int location) {
			 
			if(location==0) {// deleting the first element
				head=head.next; 
			}
		 
			size--;
		}
	 
	 // Delete from first element linkedList
	 public void deleteLastFromLinkedList() {
		 	Node tempNode=head;
			 int iterator=0;
			while(iterator<size-1 ) {// deleting the last element
				tempNode=tempNode.next;
				 iterator++;
			}
			tempNode.next=null;	
			size--;
		}
	 
	 
	 // Delete from gicen index
	 public void deleteindexedFromLinkedList(int index1) {
		 	Node tempNode=head;
			 int iterator=0;
			while(iterator<index1-1 ) {// deleting the last element
				tempNode=tempNode.next;
				 iterator++;
			}
			tempNode.next=tempNode.next.next;	
			 
			size--;
		}
	 
	 
	 
	 
 }