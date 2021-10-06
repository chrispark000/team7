import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;


public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		//Creating A Map
		//Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(9, 11)); //Creates PacMan at location x, y

		//Start The Game
		frame.startGame();

		//Need to wait for map getLoc function to be implemented for this to work
		ArrayList<Location> moves = pacman.get_valid_moves();
		assertTrue(moves.contains(new Location(9, 12)));
		assertTrue(moves.contains(new Location(10, 11)));
		assertTrue(moves.contains(new Location(10, 12)));

	}
}
