//-----------------------------------------------------
//Title: BST Class
//Author: Eren-Sakarya
//ID: 12521841116
//Section: 1
//Assignment: 3
//Description: BST class contains the operation methods
//			   of a classic Binary Search Tree.
//-----------------------------------------------------
public class BST{
	Node root;
//--------------------------------------------------------
// Summary: Default Constructor for BST
// Precondition: Does not have a precondition
// Postcondition: The root is set to null
//--------------------------------------------------------
	public BST() {
		root=null;
	}
//--------------------------------------------------------
// Summary: put method that sends the given 
//	 		values to recursive put method.
// Precondition: name and surnames are String, transferfee is Integer
// Postcondition: The values are sent to the put method
//--------------------------------------------------------
	public void put(String name, String surname, int transferfee) {
		root=put(root,name,surname,transferfee);
	}
//--------------------------------------------------------
// Summary: recursive put method that adds the given 
//	 			values to Binary Search Tree 
// Precondition: name and surnames are String, transferfee is Integer
// Postcondition: The values are added to the BST
//--------------------------------------------------------
	public Node put(Node n, String name, String surname, int transferfee) {
		if(n==null) {
			return new Node(name,surname,transferfee);
		}
		if(transferfee<n.getTransferfee()) {
			n.setLeft(put(n.getLeft(), name, surname, transferfee));
		}
		if(transferfee>n.getTransferfee()) {
			n.setRight(put(n.getRight(), name, surname, transferfee));
		}
		return n;
	}
//--------------------------------------------------------
// Summary: Calls the deleteMin method
// Precondition: name and surnames are String
// Postcondition: The values are deleted from the bst
//--------------------------------------------------------
	public void deleteMin(String name, String Surname) {
		root=deleteMin(root);
	}
//--------------------------------------------------------
// Summary: recursive deleteMin method that deletes minimum elemet
// Precondition: root is a Node.
// Postcondition: The root is deleted from BST.
//--------------------------------------------------------
	public Node deleteMin(Node root) {
		if(root.getLeft()==null) {
			return root.getRight();
		}
		root.setLeft(deleteMin(root.getLeft()));
		return root;
	}
//--------------------------------------------------------
// Summary: min method that finds minimum element
// Precondition: root is a Node.
// Postcondition: The root is returned from BST.
//--------------------------------------------------------
	public Node min(Node root) {
		Node n=root;
		while(n.getLeft()!=null) {
			n=n.getLeft();
		}
		return n;
	}
//--------------------------------------------------------
// Summary: delete method that calls recursive delete method
// Precondition: name and surnames are String
// Postcondition: The root is deleted from BST.
//--------------------------------------------------------
	public void delete(String name, String surname) {
		root=delete(root,name,surname);
	}
//--------------------------------------------------------
// Summary: Recursive delete method that deletes the node according to name and surname
// Precondition: name and surnames are String, root is a Node
// Postcondition: The root is deleted from BST.
//--------------------------------------------------------
	public Node delete(Node root, String name, String surname) {
		if(root==null) {
			return null;
		}
		root=inorderNode(root,name,surname);
		if(root.getLeft()==null) {
			return root.getRight();
		}
		if(root.getRight()==null) {
			return root.getLeft();
		}
		Node n=root;
		root=min(n.getRight());
		root.setLeft(deleteMin(n.getRight()));
		root.setLeft(n.getLeft());
		return root;
	}
//--------------------------------------------------------
// Summary: Recursive inOrderNode method that return a Node according to name and surname
// Precondition: name and surnames are String, root is a Node
// Postcondition: The root is returned from BST.
//--------------------------------------------------------
	public Node inorderNode(Node root,String name, String surname) {
		if(root==null) {
			return null;
		}
		inorderNode(root.getLeft(), name, surname);
		if(name.equalsIgnoreCase(root.getName())) {
			return root;
		}
		inorderNode(root.getRight(), name, surname);
		return root;
	}
//--------------------------------------------------------
// Summary: get Method that returns a String according to inorder method
// Precondition: name and surnames are String
// Postcondition: The string is returned from BST Node.
//--------------------------------------------------------
	public String get(String name, String surname) {
		String[] arr=new String[6];
		inorder(root,arr,0);
		for(int i=0; i<6; i++) {
			if(name.equalsIgnoreCase(arr[i])) {
				return arr[i];
			}
		}
		return "";
	}
//--------------------------------------------------------
// Summary: inorder Method that returns the index of last call
// Precondition: root is a Node, arr is String array, i is an integer.
// Postcondition: The index is returned from BST Node.
//--------------------------------------------------------
	public int inorder(Node root,String[]arr, int i) {
		if(root==null) {
			return i;
		}
		i=inorder(root.getLeft(),arr,i);
		arr[i++]=root.getName();
		i=inorder(root.getRight(),arr,i);
		return i;
	}
//--------------------------------------------------------
// Summary: non-recursive printInorder Method that sends the root to the
//			recursive printOrder Method.
// Precondition: Does not have a precondition
// Postcondition: BST is printed inorder.
//--------------------------------------------------------
	public void printInorder() {
		printInorder(root);
	}
//--------------------------------------------------------
// Summary: recursive printInorder Method that prints the BST inorder
// Precondition: root is a Node.
// Postcondition: BST is printed inorder.
//--------------------------------------------------------
	public void printInorder(Node root) {
		if(root==null) {
			return;
		}
		printInorder(root.getLeft());
		if(root!=null) {
			System.out.print(root.getName()+" "+root.getSurname()+" "+root.getTransferfee()+",");
		}
		printInorder(root.getRight());
	}
//--------------------------------------------------------
// Summary: non-recursive nth Method that sends root and the n to the recursive
//			nthElement method.
// Precondition: n is a integer
// Postcondition: Root and n is sent.
//--------------------------------------------------------
	public void nthElement(int n) {
		nthElement(root,n);
	}
	int count=0;
//--------------------------------------------------------
// Summary: recursive nth Method that finds the nth Elements in BST
// Precondition: n is a integer, root is a Node
// Postcondition: nth Element is printed.
//--------------------------------------------------------
	public void nthElement(Node root, int n) {
		if(root!=null) {
			nthElement(root.getLeft(),n);
			count++;
			if(count==n) {
				System.out.println(root.getName());
			}
			nthElement(root.getRight(),n);
		}
	}
//--------------------------------------------------------
// Summary: non-recursive Range Method that sends root and the values a and b to the recursive
//				Range method.
// Precondition: a and b are integers
// Postcondition: Root and a and b are sent.
//--------------------------------------------------------
	public void Range(int a, int b) {
		Range(root,a,b);
	}
//--------------------------------------------------------
// Summary: recursive Range Method that finds the Range between given ints in BST
// Precondition: a and b are integers, root is a Node
// Postcondition: The elements between a and b are printed.
//--------------------------------------------------------
	public void Range(Node root, int a, int b) {
		if(root==null) {
			return;
		}
		if(a<root.getTransferfee()) {
			Range(root.getLeft(),a,b);
		}
		if(a<=root.getTransferfee()&&b>=root.getTransferfee()) {
			System.out.println(root.getName()+" "+root.getSurname());
		}
		Range(root.getRight(),a,b);
	}
}