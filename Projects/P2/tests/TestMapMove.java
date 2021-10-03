import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	public void testMapMove() {
		
		Map myMap = new Map(30);
		PacManComponent pc = new PacManComponent(5, 5,20);
		myMap.add("pacman", new Location(5, 5), pc, Map.Type.PACMAN);

		assertTrue(myMap.move("pacman", new Location(5, 6), Map.Type.PACMAN));
		assertFalse(myMap.move("ghost", new Location(5, 6), Map.Type.PACMAN));
	}
}
