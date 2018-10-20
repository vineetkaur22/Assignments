import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DessertShoppeTest {
	private DessertShoppe ds;
	
	@Before
	public void setUp() throws Exception {
		ds = new DessertShoppe(10, "Test Shoppe");
	}
		
	@Test
	public void testCents2dollarsAndCentsmethod() {
		String expectedString = "2.01";
		assertEquals("cents2dollarsAndCentsmethod failed", expectedString, ds.cents2dollarsAndCentsmethod(201));
	}

}
