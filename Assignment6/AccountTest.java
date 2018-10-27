
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AccountTest {
	private Account account1, account2;


	@Before 
	public void setUp() throws Exception {
		account1 = new Account ("Jane","Adams",1000);
		account2 = new Account ("Jill","Mathews",2000);
	}

	@Test
	public void debitTransactionTest() {
		assertTrue( account1.DebitTransaction(100) == 900d);
	}
	
	@Test
	public void creditTransactionTest() {
		assertTrue( account2.CreditTransaction(1000) == 3000);
	}
	

}
