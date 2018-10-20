import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CandyTest {

	private Candy candy;
	
	@Before
	public void setUp() throws Exception {
		candy = new Candy("Gummy Worms", 1.33, 89);
	}
	
	@Test
	public void testGetCost() {
		int expectedCandyCost = 118;
		assertEquals("getCost for Candy failed", expectedCandyCost, candy.getCost());	
	}

}
