/*
* Program: PhoneNumberDissector
* Programmer: Stanley Zheng
* Date Feb 25, 2014
* Implement a program that reads phone numbers, and for each phone number,
* it displays the phone number's three components country code, area code,
* and local number. See the sample session for details.
*/


import java.util.Scanner;

public class PhoneNumberDissector
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    String line;       // user entry
    String cc;         // country code
    String area;       // three-digit area code
    String local;      // the local phone number
    int position;      // index position within user-entered line
    int savePosition;  // previous index position


    System.out.println("PHONE NUMBER DISSECTOR\n");
    System.out.print(
      "Enter a phone number in the form cc-area-local,\n" +
      "where cc = country code digits, area = area code digits,\n" +
      "and local = local phone digits.\n" +
      "Or enter q to quit:\n");
    line = stdIn.nextLine();
    //1-757-7739438

    while (!line.equalsIgnoreCase("q"))
    {
      String[] tokens = line.split("-");
      System.out.println("Country code is: " + tokens[0]);
      System.out.println("Area code is: " + tokens[1]);
      System.out.println("Local Phone Number is: " + tokens[2]);
      System.out.println("Enter a new phone number or (Q)uit: ");
      line = stdIn.nextLine();
   //...//enter your own code

    } // end while
  } // end main
} // end class PhoneNumberDissector