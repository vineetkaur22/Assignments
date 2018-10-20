import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CookieTest {

	private Cookie cookie;
	private Cookie cookie2;
	@Before
	public void setUp() throws Exception {
		cookie = new Cookie ("Oatmeal Raisin Cookies", 4, 399);
		cookie2 = new Cookie ("Oatmeal Raisin Cookies", 4, 0);
	}
	
	@Test
	public void testGetCost() {
		int expectedCookieCost = 133;
		assertEquals("getCost for Cookie failed", expectedCookieCost, cookie.getCost());	
	}

	@Test
	public void testGetCost2() {
		int expectedCookieCost = 0;
		assertEquals("getCost2 for Cookie failed", expectedCookieCost, cookie2.getCost());	
	}

}
