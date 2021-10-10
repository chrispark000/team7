import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame(); //Creates a new map and tokens

		//Creating players
		Ghost ghost = frame.addGhost(new Location(9, 11), "Inky", Color.red);

		//Start the game
		frame.startGame();

		ArrayList<Location> moves = ghost.get_valid_moves();
		boolean canMove = ghost.move();
		assertTrue(canMove);
		assertTrue(moves.contains(ghost.myLoc));
	}
}
