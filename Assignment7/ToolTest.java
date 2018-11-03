import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ToolTest {
private Rock r;
private Paper p;
private Scissors s;

@Before
public void setUp() throws Exception {
	 s = new Scissors(5);	 
	 p = new Paper(7);
	 r = new Rock(15);
}
	
@Test
public void fightTest() {
		assertEquals("Scissors test failed", s.fight(p) , true);
		assertEquals("Paper test failed", p.fight(r) , false);
		assertEquals("Rock test failed", r.fight(s) , true);		
	}

}
