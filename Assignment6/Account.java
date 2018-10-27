
public class Account {

	// instance data members
	
	protected String FirstName, LastName; // two String members
	protected double CurBalance;

	// constructor
	public Account(String fname, String lname, double cb)
	{
		FirstName = fname; 
		LastName = lname; 
		CurBalance = cb;
	}

	// methods
	public String getAcctType()
	{
		// returns the string of the class name
		return this.getClass().getName(); 
	}

	public double DebitTransaction(double debitAmount)
	{
		CurBalance = CurBalance - debitAmount ; 
		return CurBalance;
	}

	public double CreditTransaction(double creditAmount)
	{
		return CurBalance = CurBalance + creditAmount;
	}

	public String toString()
	{
		return "Account name: " + FirstName + " " + LastName + ", Account Type: " + 
		getAcctType() + ", Balance: " + String.format("$%.2f", CurBalance);
	}

}
class CheckingAccount extends Account{

	static private double MinBalance = 100;
    static private double Fee = 10;
	
	public CheckingAccount(String fname, String lname, double cb) {
		super (fname , lname, cb);
	}

	@Override
	public double DebitTransaction(double debitAmount) {
		super.DebitTransaction(debitAmount);
		ChargeFee();
		return CurBalance;
	}
	
	private  void ChargeFee() {
		if (CurBalance < MinBalance) {
			CurBalance = CurBalance - Fee;
		}
	}

	public double CreditTransaction(double creditAmount) {
		super.CreditTransaction(creditAmount);
		ChargeFee ();
		return CurBalance;
	}
}




