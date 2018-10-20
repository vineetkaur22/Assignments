import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CheckoutTest extends TestCase {
	private Checkout checkout;
	
	@Before
	public void setUp() throws Exception {
		checkout = new Checkout();
		checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
	}

	
	@Test
	public void testCheckout() {
		 int expectedTotalCost = 898;
		 assertEquals("Error in getting totalCost", expectedTotalCost, checkout.totalCost());
	}
	
	@Test
	public void testTaxRate() {
		 int expectedTotalTax = 58;
		 assertEquals("Error in calculating tax", expectedTotalTax, checkout.totalTax());
	}

	@Test
	public void testGetItemBillName() {
		String inputString = "12345678912345678900";
		String expectedString = "12345678912345678900     ";
		
		assertEquals("getItemBillName not successful", expectedString, checkout.getItemBillName(inputString));
	}
	
}
