/*
*	Project name: Saving Account Driver
*	Name: Lookmai Rattana
*	Date: 04/22/14
*	Description: Saving Account Driver. Give it interest for accounts calculating over 5 month span
*/
class SavingAccountDriver{

	public static void main(String[] args)
	{

	SavingAccount saver1 = new SavingAccount(2000,"10002");
	SavingAccount saver2 = new SavingAccount(3000,"10003");

	System.out.println("Monthly balances for one year with 0.05 annual interest:\n");
	System.out.println("Month  Account #   Balance   Account #   Balance");
	System.out.println("----- ---------    -------   ---------  -------\n");
	saver1.setInterestRate(.05);
	saver2.setInterestRate(.05);

		for (int i = 0; i <12; i++)
		{
			System.out.print(i+ "\t\t" + saver1.getAccount()+ "\t\t" + saver1.getBalance()+"\t\t");
			System.out.println(saver2.getAccount()+"\t"+saver2.getBalance());
			saver1.addMonthlyInterest();
			saver2.addMonthlyInterest();
		}
	}
}