//-----------------------------------------------------
// Title: Driver Class
// Author: Eren/Sakarya
// ID: 12521841116
// Section: 1
// Assignment: 1
// Description: This class tests the Maze class and turns the
//				input file to a 2D array.
//-----------------------------------------------------
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws Exception {
//--------------------------------------------------------
// Summary: Main method that takes the file from user and 
//			executes the Maze
// Precondition: Does not have a precondition
// Postcondition: The beginning point of the Maze is sent
//				into the Maze.java.
//--------------------------------------------------------
		Scanner keyboard=new Scanner(System.in);
		String f=keyboard.next();
		File file=new File(f);
		char[][] map = new char[11][16]; 					
		try {
			Scanner in=new Scanner(file);        
		    for(int i=0; i < 11; i++) {
		        map[i] = in.nextLine().toCharArray();
		    }
		}
		catch(FileNotFoundException e) {
			
		}
		Maze Maze=new Maze();
		Maze.StartMaze(map, 1, 0);
		System.out.println(Maze.treasurecount+" treasures are found.");
		if(Maze.treasurecount>0) {
			System.out.println("Paths are: ");
		}
	}
}
