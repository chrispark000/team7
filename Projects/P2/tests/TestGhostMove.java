import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame fram = new NoFrame(); //Creates a new map and tokens

		//Creating players
		PacMan pacman = frame.addPacMan(new Location(9, 11));

		//Start the game
		frame.startGame();

		boolean canMove = pacman.move();
		assertTrue(canMove);
	}
}
