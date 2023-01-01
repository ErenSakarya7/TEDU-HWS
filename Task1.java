import java.util.*;
//-----------------------------------------------------
//Title: Task1 Class
//Author: Eren-Sakarya
//ID: 12521841116
//Section: 1
//Assignment: 3
//Description: Test Class for Player Database takes operation no
//			   then executes operation.
//-----------------------------------------------------
public class Task1 {
//--------------------------------------------------------
// Summary: Main method that will execute each operation in Player Database
// Precondition: Does not have a precondition
// Postcondition: Prints each operation.
//--------------------------------------------------------
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		PlayerDatabase db=new PlayerDatabase();
		
		String whole;
		String name, surname;
		int transferfee,max,min;
		int op;
		do {
			System.out.println("Enter Operation number");
			op=keyboard.nextInt();
			if(op==1) {
				name=keyboard.next();
				surname=keyboard.next();
				transferfee=Integer.parseInt(keyboard.next());
				db.addPlayer(name, surname, transferfee);
			}
			if(op==2) {
				name=keyboard.next();
				surname=keyboard.next();
				db.removePlayer(name, surname);
			}
			if(op==3) {
				name=keyboard.next();
				surname=keyboard.next();
				db.searchByName(name, surname);
			}
			if(op==4) {
				min=keyboard.nextInt();
				max=keyboard.nextInt();
				db.searchByRange(min, max);
			}
			if(op==5) {
				db.printAllPlayers();
			}
			if(op==6) {
				min=keyboard.nextInt();
				db.FindKSmallest(min);
			}
			if(op==7) {
				break;
			}
		}while(true);
	}
}
