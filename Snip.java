/*
* Program: Example 6, P191
* Programmer: Stanley Zheng
* Date Feb 25, 2014
* Description: extract song out of a list of songs; list is * daft punks singles from its latest album
*/


import java.util.Scanner;

public class Snip{
 	public static void main(String[] args){

	Scanner stdIn = new Scanner(System.in);
	String songs =
		"1. Daft Punk - Get Lucky\n"+
		"2. Daft Punk - Lose Yourself to Dance\n"+
		"3. Daft Punk -  Doin' It Right\n"+
		"4. Daft Punk - Instant Crush\n"+
		"5. Daft Punk -  Give Life Back to Music\n";
    String searchText; 	  // text that is searched for
    int foundIndex =0;    // pos of text is found
    int count = 0;        // # of occurrences of searchText

    System.out.print("Enter search text: ");
    searchText = stdIn.nextLine();

	/* search for the text occurance */
	//insertion of code
	//will return -1 when no index found.
    while(foundIndex != -1){
		  if(foundIndex > 0)
		    foundIndex = songs.indexOf(searchText, foundIndex);
		  else
		    foundIndex = songs.indexOf(searchText);

		  if(foundIndex != -1) {
		    count++;
		    foundIndex += searchText.length();
		  }
		}


    System.out.println("Number of occurrences of \"" +
      searchText + "\": " + count);
 	}
}