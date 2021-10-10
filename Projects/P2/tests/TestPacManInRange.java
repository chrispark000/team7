import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{

		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(9, 11), "clyde", Color.cyan);
		PacMan pacman = frame.addPacMan(new Location(9, 12));

		frame.startGame();
		boolean ret = ghost.is_pacman_in_range();

		assertTrue(ret);
	}
}
