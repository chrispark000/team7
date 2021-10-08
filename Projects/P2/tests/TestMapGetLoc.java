import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;

import javax.sound.sampled.AudioFileFormat.Type;


public class TestMapGetLoc extends TestCase{
	
	public void testMapGetLoc() {
		Map myMap = new Map(30);
		PacManComponent pc = new PacManComponent(2, 4, 20);
		myMap.add("pacman", new Location(2, 4), pc, Map.Type.PACMAN);

		HashSet<Map.Type> ret = myMap.getLoc(new Location(2, 4));

		assertEquals(Map.Type.PACMAN, ret.iterator().next());
	}
}
