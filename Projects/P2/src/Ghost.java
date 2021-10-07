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

	public ArrayList<Location> get_valid_moves() {
		return null;
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

		if ((myMap.getLoc(new Location (myLoc.x+1,myLoc.y))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location (myLoc.x,myLoc.y+1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location (myLoc.x-1,myLoc.y))).contains(Map.Type.PACMAN)) {
			return true;
		}
	
		if ((myMap.getLoc(new Location (myLoc.x,myLoc.y-1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location (myLoc.x+1,myLoc.y-1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location (myLoc.x-1,myLoc.y-1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location (myLoc.x+1,myLoc.y+1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		if ((myMap.getLoc(new Location (myLoc.x+1,myLoc.y-1))).contains(Map.Type.PACMAN)) {
			return true;
		}

		return false;
	}

	public boolean attack() {
		return false;
	}
}
