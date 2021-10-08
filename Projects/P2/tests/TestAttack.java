import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		
		Ghost ghost = frame.addGhost(new Location(9, 11), "clyde", Color.cyan);
		PacMan pacman = frame.addPacMan(new Location(9, 12));

		frame.startGame();

		boolean ret = ghost.attack();
		assertTrue(ret);
	}
}
