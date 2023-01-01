//-----------------------------------------------------
// Title: Node Class
// Author: Eren/Sakarya
// ID: 12521841116
// Section: 1
// Assignment: 1
// Description: This class marks the configuration of
// 				LinkedList using nodes.
//-----------------------------------------------------
public class Node {
	private String name, surname;
	int transferfee;
	Node right, left;
//--------------------------------------------------------
// Summary: Constructor for Node class.
// Precondition: name and surname are Strings, transferfee is int
// Postcondition: The values are assigned to data.
//--------------------------------------------------------
	public Node(String name, String surname, int transferfee) {
		this.name = name;
		this.surname = surname;
		this.transferfee = transferfee;
	}
//--------------------------------------------------------
// Summary: Constructor for Node class.
// Precondition: name and surname are Strings.
// Postcondition: The values are assigned to data.
//--------------------------------------------------------
	public Node(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
//--------------------------------------------------------
// Summary: Default Constructor for Node class.
// Precondition: Does not have a precondition
// Postcondition: The right and left nodes are assigned to null.
//--------------------------------------------------------
	public Node() {
		right=left=null;
	}
//--------------------------------------------------------
// Summary: Return data of name String.
// Precondition: Does not have a precondition
// Postcondition: The value of the data is returned
//--------------------------------------------------------
	public String getName() {
		return name;
	}
//--------------------------------------------------------
// Summary: Sets the name of node
// Precondition: name is a String.
// Postcondition: The value of name is set.
//--------------------------------------------------------
	public void setName(String name) {
		this.name = name;
	}
//--------------------------------------------------------
// Summary: Return data of surname String.
// Precondition: Does not have a precondition
// Postcondition: The value of the data is returned
//--------------------------------------------------------
	public String getSurname() {
		return surname;
	}
//--------------------------------------------------------
// Summary: Sets the surname of node
// Precondition: surname is a String.
// Postcondition: The value of surname is set.
//--------------------------------------------------------
	public void setSurname(String surname) {
		this.surname = surname;
	}
//--------------------------------------------------------
// Summary: Return data of transferfee int.
// Precondition: Does not have a precondition
// Postcondition: The value of the data is returned
//--------------------------------------------------------
	public int getTransferfee() {
		return transferfee;
	}
//--------------------------------------------------------
// Summary: Sets the transferfee of node
// Precondition: transferfee is a Integer.
// Postcondition: The value of transferfee is set.
//--------------------------------------------------------
	public void setTransferfee(int transferfee) {
		this.transferfee = transferfee;
	}
//--------------------------------------------------------
// Summary: Return data of right Node.
// Precondition: Does not have a precondition
// Postcondition: The value of the data is returned
//--------------------------------------------------------
	public Node getRight() {
		return right;
	}
//--------------------------------------------------------
// Summary: Sets the node right of the current node
// Precondition: right is a Node.
// Postcondition: The value of node is set.
//--------------------------------------------------------
	public void setRight(Node right) {
		this.right = right;
	}
//--------------------------------------------------------
// Summary: Return data of Left Node.
// Precondition: Does not have a precondition
// Postcondition: The value of the data is returned
//--------------------------------------------------------
	public Node getLeft() {
		return left;
	}
//--------------------------------------------------------
// Summary: Sets the node left of the current node
// Precondition: left is a Node.
// Postcondition: The value of node is set.
//--------------------------------------------------------
	public void setLeft(Node left) {
		this.left = left;
	}
	
	
	
}

