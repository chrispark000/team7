import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
    		Location myLoc = new Location(5, 5);
    		PacMan pacman = frame.addPacMan(myLoc);
    		CookieComponent returnedCookie;
		
    		CookieComponent myCookie = new CookieComponent(5, 5, 4);
    
    		frame.getMap().add("cookie", myLoc, myCookie, Map.Type.COOKIE);
    		frame.startGame();

		returnedCookie = (CookieComponent)pacman.consume();
    		assertEquals(returnedCookie.getClass(), myCookie.getClass());
	}
}
