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
	private char data;
	private Node next;
	
	public Node(char copy) {
//--------------------------------------------------------
// Summary: Constructor for Node class.
// Precondition: copy is a char value.
// Postcondition: The char value is assigned to data.
//--------------------------------------------------------
		this.data=copy;
	}
	public char getData() {
//--------------------------------------------------------
// Summary: Gives the data of the Node.
// Precondition: Does not have a postcondition.
// Postcondition: The value of data is returned.
//--------------------------------------------------------
		return data;
	}
	public void setData(char data) {
//--------------------------------------------------------
// Summary: Sets the data for a Node.
// Precondition: data is a char.
// Postcondition: The value of the data is set
//--------------------------------------------------------
		this.data = data;
	}
	public Node getNext() {
//--------------------------------------------------------
// Summary: Returns the node after the current node.
// Precondition: Does not have a precondition.
// Postcondition: The next node is returned.
//--------------------------------------------------------
		return next;
	}
	public void setNext(Node next) {
//--------------------------------------------------------
// Summary: Sets the node after the current Node
// Precondition: next is a Node.
// Postcondition: The value of node is set.
//--------------------------------------------------------
		this.next = next;
	}
	
}
