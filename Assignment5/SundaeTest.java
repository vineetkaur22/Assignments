import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SundaeTest {

		private  Sundae sundae;
		
		@Before
		public void setUp() throws Exception {
			sundae= new Sundae ("Vanilla Ice Cream", 105,"Caramel", 50);
		}
		
		@Test
		public void testGetCost() {
			int expectedSundaeCost = 155;
			assertEquals("getCost for Sundae failed", expectedSundaeCost, sundae.getCost());	
		}
}
