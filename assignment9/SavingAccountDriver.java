/*
o	Project name: SavingAccount
o	Name: Stanley Zheng
o	Date: April 23, 2014
o	Description: Savings Program Driver
*/

class SavingAccountDriver{
	public static void main(String[] args) {

	SavingAccount saver1 = new SavingAccount(2000,10002);
	SavingAccount saver2 = new SavingAccount(3000,10003);
	System.out.println("Monthly balances for one year with 0.05 annual interest:");

	System.out.print("Month Account #   Balance Account #   Balance\n----- ---------  ------- ---------    -------\n");
	saver1.setInterestRate(.05);
	for (int i = 0; i <12; i++){
		System.out.print(i+"     ");
		System.out.print(saver1.getAccount()+"       ");
		System.out.print(saver1.getBalance()+"   ");
		System.out.print(saver2.getAccount()+"       ");
		System.out.println(saver2.getBalance());

		saver1.addMonthlyInterest();
		saver2.addMonthlyInterest();
	}
	}
}