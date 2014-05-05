// Program: BankAccountDriver.java
// Programmer: Lookmai Rattana
// Description: Bank Program
// Date: 3/16/2014

import java.util.Scanner;

public class BankAccountDriver
{
  public static void main(String[] args)
  {
    BankAccount account = new BankAccount();
    Scanner stdIn = new Scanner(System.in);

    System.out.print("Enter Customer Name: ");
    account.setCustomer(stdIn.nextLine());
    System.out.print("Enter the Bank Account Number: ");
    String num = stdIn.nextLine();
    account.setAccountNum(Integer.parseInt(num));
    account.printAccountInfo();
  }
}
