//-----------------------------------------------------
// Title: Maze Class
// Author: Eren/Sakarya
// ID: 12521841116
// Section: 1
// Assignment: 1
// Description: This class will solve the map given in the 
//				Driver class.
//-----------------------------------------------------
public class Maze {
	int treasurecount;
	Stack path;
	
	public Maze() {
//--------------------------------------------------------
// Summary: A default constructor to call the Stack class 
// and to set value for treasure count;
// Precondition: Does not have a precondition
// Postcondition: The values for the the path and treasurecount
// set.
//--------------------------------------------------------
		path=new Stack();
		treasurecount=0;
	}
	
	public void StartMaze(char[][]map, int row,int coll) {
//--------------------------------------------------------
// Summary: Sets the starting point of the maze.
// Precondition: Map is a 2D char array, both row and coll are integers
// Postcondition: The values for map, row and coll are inserted.
//--------------------------------------------------------
		check(map, 1, 0);
	}
	
	public boolean canMove(char[][] map, int row, int coll) {
//--------------------------------------------------------
// Summary: Checks whether the inserted and row are available for movement 
// Precondition: Map is a 2D char array, both row and coll are integers
// Postcondition: The values for map, row and coll are checked.
//--------------------------------------------------------
		if(row>=0 && row<11 && coll>=0 && coll<16) {
			return map[row][coll]!='+' && map[row][coll]!='-' && map[row][coll]!='|'&&map[row][coll]!='*';
		}
		else {
			return false;
		}
	}	
	public boolean check(char[][]map, int row,int coll) {
//--------------------------------------------------------
// Summary: Checks whether the inserted and row are available for movement 
// 			using the canMove method.
// Precondition: Map is a 2D char array, both row and coll are integers
// Postcondition: The values for map, row and coll are checked.
//--------------------------------------------------------
		path.push(map[row][coll]);
		char current = map[row][coll];
		map[row][coll] = '*';
		if(current=='E') {
			treasurecount++;
			System.out.print(treasurecount+")");
			System.out.println(path.toString());
			path.pop();
			return false;		
		}
		if(canMove(map,row-1,coll)) {
			check(map,row-1,coll);
		}
		if(canMove(map,row,coll-1)) {
			check(map,row,coll-1);
		}
		if(canMove(map,row,coll+1)) {
			check(map,row,coll+1);
		}
		if(canMove(map,row+1,coll)) {
			check(map,row+1,coll);
		}
		path.pop();
		return false;
	}

}