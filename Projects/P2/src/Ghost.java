import java.util.HashSet;
import java.util.ArrayList;

import java.util.Random;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

    	//Made helper function for get_valid_moves()
	private boolean checkLocationValid(Location l) {
		return !(this.myMap.getLoc(l).contains(Map.Type.WALL));
	}

	public ArrayList<Location> get_valid_moves() {
				//All possible locations 
		Location left = new Location (this.myLoc.x - 1, this.myLoc.y);
		Location right = new Location (this.myLoc.x + 1, this.myLoc.y);
		Location down = new Location (this.myLoc.x, this.myLoc.y - 1);
		Location up = new Location (this.myLoc.x, this.myLoc.y + 1);
		Location diag_left_up = new Location (this.myLoc.x - 1, this.myLoc.y + 1);
		Location diag_left_down = new Location (this.myLoc.x - 1, this.myLoc.y - 1);
		Location diag_right_up = new Location (this.myLoc.x + 1, this.myLoc.y + 1);
		Location diag_right_down = new Location (this.myLoc.x + 1, this.myLoc.y - 1);

		//Store list to be returned here
		ArrayList<Location> moves = new ArrayList<Location>();

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
		ArrayList<Location> moves = this.get_valid_moves();
		if (moves.isEmpty()) {
			return false;
		} else {
			Random rand = new Random();
			int randNum = rand.nextInt(moves.size());
			Location newLoc = new Location(moves.get(randNum).x, moves.get(randNum).y);
			myLoc = new Location(newLoc.x, newLoc.y);
			return true;
		}
	}

	public boolean is_pacman_in_range() { 

		if ((myMap.getLoc(new Location(myLoc.x+1,myLoc.y))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location(myLoc.x,myLoc.y+1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location(myLoc.x-1,myLoc.y))).contains(Map.Type.PACMAN)) {
			return true;
		}
	
		if ((myMap.getLoc(new Location(myLoc.x,myLoc.y-1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location(myLoc.x+1,myLoc.y-1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location(myLoc.x-1,myLoc.y-1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location(myLoc.x+1,myLoc.y+1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location(myLoc.x+1,myLoc.y-1))).contains(Map.Type.PACMAN)) {
			return true;
		}
		
		return false;
	}

	public boolean attack() {
		return false;
	}
}
