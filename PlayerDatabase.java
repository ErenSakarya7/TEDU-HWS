//-----------------------------------------------------
//Title: PlayerDatabase Class
//Author: Eren-Sakarya
//ID: 12521841116
//Section: 1
//Assignment: 3
//Description: PlayerDatabase class contains the operation methods
//			   that was mentioned in Task1 Class.
//-----------------------------------------------------
public class PlayerDatabase {
	BST bst=new BST();
//--------------------------------------------------------
// Summary: AddPlayer method that adds the given 
// 			values to Binary Search Tree 
// Precondition: name and surnames are String, transferfee is Integer
// Postcondition: The values are added to the BST
//--------------------------------------------------------
	public void addPlayer(String name, String surname, int transferFee) {
		bst.put(name, surname, transferFee);
	}
//--------------------------------------------------------
// Summary: removePlayer method that removes the given 
//	 		values from the Binary Search Tree 
// Precondition: name and surnames are String
// Postcondition: The values are removed from the BST
//--------------------------------------------------------
	public void removePlayer(String name, String surname) {
		bst.delete(name,surname);
	}
//--------------------------------------------------------
// Summary: searchByName method that searches the given 
//		 	values in the Binary Search Tree 
// Precondition: name and surnames are String
// Postcondition: The values are searched in the BST and prints True or False
//				  according to the result.
//--------------------------------------------------------
	public void searchByName(String name, String surname) {
		if(bst.get(name, surname).equalsIgnoreCase(name)){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
//--------------------------------------------------------
// Summary: searchByRange method that searches the given 
//		 	values in the Binary Search Tree 
// Precondition: minFee and maxFee are integers.
// Postcondition: The values are searched in the BST
//--------------------------------------------------------
	public void searchByRange(int minFee, int maxFee) {
		bst.Range(minFee,maxFee);
	}
//--------------------------------------------------------
// Summary: printAllPlayers method that prints the given 
//			 values in the Binary Search Tree 
// Precondition: Does not have a precondition
// Postcondition: The values are printed in the BST
//--------------------------------------------------------
	public void printAllPlayers() {
		bst.printInorder();
	}
//--------------------------------------------------------
// Summary: FindKSmallest method that finds the given 
//			values in the Binary Search Tree 
// Precondition: k is a integers
// Postcondition: The values are found in the BST
//--------------------------------------------------------
	public void FindKSmallest(int k) {
		bst.nthElement(k);
	}
}

