//-----------------------------------------------------
//Title: Coordinates Class
//Author: Eren-Sakarya
//ID: 12521841116
//Section: 1
//Assignment: 4
//Description: Converts coordinates into distance then
//			   returns it.
//-----------------------------------------------------
public class Coordinates implements Comparable<Coordinates> {
	private double distance;
	private int x,y;
//--------------------------------------------------------
// Summary: Constructor of Coordinates class
// Precondition: and y are integers.
// Postcondition: Sets the x, y and distance to precondition.
//--------------------------------------------------------
	public Coordinates(int x, int y) {
		this.x=x;
		this.y=y;
		this.distance=Math.sqrt(x*x+y*y);
	}
//--------------------------------------------------------
// Summary: Getter Method for Distance.
// Precondition: Does not have a precondition
// Postcondition: Returns the distance.
//--------------------------------------------------------
	public double getDistance() {
		return distance;
	}
//--------------------------------------------------------
// Summary: Getter Method for X.
// Precondition: Does not have a precondition
// Postcondition: Returns the x.
//--------------------------------------------------------
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
//--------------------------------------------------------
// Summary: Getter Method for Y.
// Precondition: Does not have a precondition
// Postcondition: Returns the Y.
//--------------------------------------------------------
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
//--------------------------------------------------------
// Summary: compareTo Method that returns an integer depending on the comparison
// Precondition: o is a Coordinates type value
// Postcondition: Returns the value of difference between two distances
//--------------------------------------------------------
	public int compareTo(Coordinates o) {
		return (int) ((int) this.distance-o.distance);
	}
}
