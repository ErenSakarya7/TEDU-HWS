import java.util.*;
//-----------------------------------------------------
//Title: Main Class
//Author: Eren-Sakarya
//ID: 12521841116
//Section: 1
//Assignment: 4
//Description: Testing Class for the Code that takes an input
//			   and prints out the correct output.
//-----------------------------------------------------
public class Main {
//--------------------------------------------------------
// Summary: Main method that tests the code. 
// Precondition: Does not have a precondition
// Postcondition: Prints out the correct output.
//--------------------------------------------------------
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);	
		System.out.println("Enter coordinates: ");
		String input=keyboard.nextLine();
		int op=keyboard.nextInt();
		input=input.replace("[", "").replace("]", "");
		String []s1=input.split(",");
		int [][]arr=new int[s1.length/2][2];
		int i=0, j=1;
		while(i<arr.length) {
			arr[i][0]=Integer.parseInt(s1[j-1]);
			arr[i][1]=Integer.parseInt(s1[j]);
			j+=2;
			i++;	
		}
		Coordinates coordsarr[]=new Coordinates[arr.length];
		int k=0;
		while(k<arr.length) {
			coordsarr[k]=new Coordinates(arr[k][0],arr[k][1]);
			k++;
		}
		Arrays.sort(coordsarr);
		if(op!=0) {
			System.out.print("[");
		}
		int h=0;
		while(true) {
			System.out.print("["+coordsarr[h].getX()+","+coordsarr[h].getY()+"]");
			h++;
			if(h==op) {
				break;
			}
			else {
				System.out.print(",");
			}
		}
		if(op!=0) {
			System.out.print("]");
		}
	}
}
