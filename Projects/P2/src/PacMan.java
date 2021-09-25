import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	//Made helper function for get_valid_moves()
	private boolean checkLocationValid(Location l) {
		return this.myMap.getLoc(l) == Map.Type.EMPTY || map.getLoc(l) == Map.Type.COOKIE;
	}

	public ArrayList<Location> get_valid_moves() {
		//All possible locations 
		left = new Location (this.myLoc.x - 1, this.myLoc.y);
		right = new Location (this.myLoc.x + 1, this.myLoc.y);
		down = new Location (this.myLoc.x, this.myLoc.y - 1);
		up = new Location (this.myLoc.x, this.myLoc.y + 1);
		diag_left_up = new Location (this.myLoc.x - 1, this.myLoc.y + 1);
		diag_left_down = new Location (this.myLoc.x - 1, this.myLoc.y - 1);
		diag_right_up = new Location (this.myLoc.x + 1, this.myLoc.y + 1);
		diag_right_down = new Location (this.myLoc.x + 1, this.myLoc.y - 1);

		//Store list to be returned here
		moves = new ArrayList<Location>();

		//Check if each location works 
		if (checkLocationValid(left)) {
			moves.add(left);
		}
		if (checkLocationValid(right)) {
			moves.add(right);
		}
		if (checkLocationValid(down)) {
			moves.add(down);
		}
		if (checkLocationValid(up)) {
			moves.add(up);
		}
		if (checkLocationValid(diag_left_up)) {
			moves.add(diag_left_up);
		}
		if (checkLocationValid(diag_left_down)) {
			moves.add(diag_left_down);
		}
		if (checkLocationValid(diag_right_up)) {
			moves.add(diag_right_up);
		}
		if (checkLocationValid(diag_right_down)) {
			moves.add(diag_right_down);
		}

		return (moves);	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
