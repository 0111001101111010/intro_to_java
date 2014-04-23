/*
o	Project name:
o	Name:
o	Date:
o	Description:
*/

class SavingAccountDriver{
	public static void main(String[] args) {

	SavingAccount saver1 = new SavingAccount(2000,10002);
	SavingAccount saver2 = new SavingAccount(3000,10003);
	System.out.println("Monthly balances for one year with 0.05 annual interest:");

	System.out.print("Month Account #   Balance Account #   Balance\n----- ---------  ------- ---------    -------\n");
	for (int i = 0; i <12; i++){
		System.out.println("");
	}
	}
}