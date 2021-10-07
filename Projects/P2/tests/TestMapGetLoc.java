import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		Map myMap = new Map(30);
		PacManComponent pc = new PacManComponent(2, 4, 20);
		myMap.add("pacman", new Location(2, 4), pc, Map.Type.PACMAN);

		assertEquals(Map.Type.PACMAN, myMap.getLoc(new Location(2, 4)));
	}
}
