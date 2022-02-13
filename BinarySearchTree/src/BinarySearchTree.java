
public class BinarySearchTree {
BinarySTNode root;

//constructor

//BinarySearchTree(){
//	root=null; // root doesnt exists
//}

// Insert method
 private BinarySTNode insert(BinarySTNode currentnode, int value) {
	 if (currentnode==null) {
		 BinarySTNode newNode = new BinarySTNode();
		 newNode.value=value;
		 System.out.println("The value has been successfully set.");
		 root = newNode;//////// imran
		 return root;
	 }
	 else if (value<=currentnode.value){
	 currentnode.left=insert(currentnode.left, value);
	 return currentnode;
	}
	 
	 else {
	 currentnode.right=insert(currentnode.right, value);
	 return currentnode;
	}
 }

 
 // 
 void insert(int value) {
	 insert(root,value);
 }
 
 
}
