import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame(); //Creates a new map and tokens

		//Creating players
		PacMan pacman = frame.addPacMan(new Location(9, 11));

		//Start the game
		frame.startGame();

		ArrayList<Location> moves = pacman.get_valid_moves();
		boolean canMove = pacman.move();
		assertTrue(canMove);
		assertTrue(moves.contains(pacman.myLoc));
	}
}
