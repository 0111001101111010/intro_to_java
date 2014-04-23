/*
*	Project name: Saving Account Java
*	Name: Lookmai Rattana
*	Date: 04/22/14
*	Description: Saving Accounts for Java online. Has a balance and account number
*/

class SavingAccount{

	static double annualInterestRate;
	final String ACCOUNT_NUMBER;
	double balance;

	SavingAccount(double bal, String acc)
	{
		balance = bal;
		ACCOUNT_NUMBER = acc;
	}
	//interest rate return
	double getInterestRate()
	{
		return annualInterestRate;
	}
	void setInterestRate(double a)
	{
		annualInterestRate = a;
	}
	//get account number
	String getAccount()
	{
		return ACCOUNT_NUMBER;
	}
	double getBalance()
	{
		return balance;
	}
	//add interest
	void addMonthlyInterest()
	{
		double temp  = balance + (balance * annualInterestRate/12);
		balance = (double) Math.round(temp * 100) / 100;
	}
}