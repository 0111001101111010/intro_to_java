/*
o	Project name: SavingAccount
o	Name: Stanley Zheng
o	Date: April 23, 2014
o	Description: Savings Program Class
*/
class SavingAccount{
	static double annualInterestRate;
	final int ACCOUNT_NUMBER;
	double balance;

	SavingAccount(double b, int a){
		balance = b;
		ACCOUNT_NUMBER = a;
	}
	void addMonthlyInterest(){
		balance = balance + (balance * annualInterestRate/12);
		balance = (double) Math.round(balance * 100) / 100;
	}
	double getInterestRate(){
		return annualInterestRate;
	}
	void setInterestRate(double a){
		annualInterestRate = a;
	}

	int getAccount(){
		return ACCOUNT_NUMBER;
	}
	double getBalance(){
		return balance;
	}
//sets the annual interest rate.
}