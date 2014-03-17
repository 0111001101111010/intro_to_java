
// Program: BankAccountDriver
// Programmer: Stanly Zheng
// Description:
// Write a program that creates a bankaccount object and fills it
/*
// Date: 3/15/2014
*/
import java.util.Scanner;

public class BankAccountDriver
{
  public static void main(String[] args)
  {
    //variables
    Scanner stdIn = new Scanner(System.in);
    BankAccount account = new BankAccount();

    System.out.print("Enter Customer Name: ");
    account.setCustomer(stdIn.nextLine());
    //BankAccount Number Can't be larger than 2147483647.
    try{
    System.out.print("Enter the Bank Account Number: ");
    String num = stdIn.nextLine();
    account.setAccountNum(Integer.parseInt(num));
    account.printAccountInfo();
  }
   catch(NumberFormatException except){
     System.out.print("Not a valid int or larger than 2147483647.");
   }
  } // end main
} // end BankAccountDriver
