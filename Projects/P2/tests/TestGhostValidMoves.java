import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList; 

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		//Creating A Map
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		//Creating Players
		Ghost ghost = frame.addGhost(new Location(9, 11), "name", Color.red); //Creates a red ghost named "name" at location x,y

		//Start The Game
		frame.startGame();
		
		//Need to wait for map getLoc function to be implemented for this to work	
		ArrayList<Location> moves = ghost.get_valid_moves();
		assertTrue(moves.contains(new Location(9, 12)));
		assertTrue(moves.contains(new Location(10, 11)));
		assertTrue(moves.contains(new Location(10, 12)));

	}
}
