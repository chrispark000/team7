import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

import java.util.Random;

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
			myLoc = new Location(myLoc.x - newLoc.x, myLoc.y - newLoc.y);
			return true;
		}
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
