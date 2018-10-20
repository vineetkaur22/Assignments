import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IcecreamTest {

	private IceCream icecream;
	
	@Before
	public void setUp() throws Exception {
		icecream= new IceCream ("Strawberry Ice Cream", 145);
	}
	
	@Test
	public void testGetCost() {
		int expectedIceCreamCost = 145;
		assertEquals("getCost for IceCream failed", expectedIceCreamCost, icecream.getCost());	
	}
}
