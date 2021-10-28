import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase{
	
	public void testMapEatCookie() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Location myLoc = new Location(5, 5);
		PacMan pacman = frame.addPacMan(myLoc);
		CookieComponent returnedCookie;

		CookieComponent myCookie = new CookieComponent(5, 5, 4);

		frame.getMap().add("cookie", myLoc, myCookie, Map.Type.COOKIE);
		frame.startGame();

		returnedCookie = (CookieComponent)frame.getMap().eatCookie("pacman");
		assertSame(returnedCookie.getClass(), myCookie.getClass());
	}
}
