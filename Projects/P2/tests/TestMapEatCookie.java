import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase{
	
	public void testMapEatCookie() {
		NoFrame frame = new NoFrame();
		Location myLoc = new Location(5, 5);
		PacMan pacman = frame.addPacMan(myLoc);

		CookieComponent myCookie = new CookieComponent(5, 5, 1);

		frame.getMap().add("cookie", myLoc, myCookie, Map.Type.COOKIE);
		frame.startGame();

		assertSame(frame.getMap().eatCookie("pacman"), myCookie);
	}
}
