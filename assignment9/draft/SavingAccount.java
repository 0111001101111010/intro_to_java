/*
*	Project name: Saving Account Java
*	Name: Lookmai Rattana
*	Date: 04/22/14
*	Description: Saving Accounts for Java online
*/

class SavingAccount{

	static double annualInterestRate;
	final int ACCOUNT_NUMBER;
	double balance;

	SavingAccount(double bal, int acc)
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
	int getAccount()
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