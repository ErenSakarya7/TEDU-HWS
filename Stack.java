//-----------------------------------------------------
// Title: Stack Class
// Author: Eren/Sakarya
// ID: 12521841116
// Section: 1
// Assignment: 1
// Description: This class does the basic operations
//				of a Stack using LinkedList.
//-----------------------------------------------------
public class Stack {
	protected Node head;
	public Stack() {
//--------------------------------------------------------
// Summary: Sets the starting point of the maze.
// Precondition: 
// Postcondition: Head node is set to null.
//--------------------------------------------------------
		head=null;
	}
	public void push(char copy) {
//--------------------------------------------------------
// Summary: Pushes data into the Stack
// Precondition: copy is a char.
// Postcondition: Sets the new node as the head node
//--------------------------------------------------------
		Node n=new Node(copy);
		n.setNext(head);
		head=n;
	}
	public char pop() {
//--------------------------------------------------------
// Summary: Removes the head node.
// Precondition: Does not have a postcondition.
// Postcondition: Returns the removed head Node's data.
//--------------------------------------------------------
		Node temp=head;
		if(head.getNext() != null) {
			head=head.getNext();
		}
		temp.setNext(null);
		return temp.getData();
	}
	public boolean isEmpty() {
//--------------------------------------------------------
// Summary: Checks whether the stack is empty
// Precondition: Does not have a post condition
// Postcondition: returns head node.
//--------------------------------------------------------
		return head==null;
	}
	public char top() {
//--------------------------------------------------------
// Summary: Gets the head nodes data
// Precondition: Does not have a post condition
// Postcondition: Returns head node's data
//--------------------------------------------------------
		return head.getData();
	}
	public String toString() {
//--------------------------------------------------------
// Summary: Changes datas of the Nodes into string and prints them
// Precondition: Does not have a post condition
// Postcondition: Returns the result as a String
//--------------------------------------------------------
        String result = "";
        Node current = head;
        while(current.getNext() != null){
            result += current.getData();
            if(current.getNext() != null){
                result += "";
            }
            current = current.getNext();
        }
        result += current.getData();
        char[]reverse=result.toCharArray();
        for(int i=result.length()-1;i>=0;i--) {
        	System.out.print(reverse[i]);
        }
        return "";
    }
}
