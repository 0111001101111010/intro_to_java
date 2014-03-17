/*
* Program: Example 7, P192
* Programmer: Stanley Zheng
* Date Feb 25, 2014
* Description: extract song out of a list of songs; list is * daft punks singles from its latest album
*/


import java.util.Scanner;

public class Songs{
 	public static void main(String[] args){

	Scanner stdIn = new Scanner(System.in);
	String songNum;  	// song number
	int songIndex; 		// pos of song index
	int eolIndex; 		// end of line index
	String song; 		// the song
	String songs =
		"1. Daft Punk - Get Lucky\n"+
		"2. Daft Punk - Lose Yourself to Dance\n"+
		"3. Daft Punk -  Doin' It Right\n"+
		"4. Daft Punk - Instant Crush\n"+
		"5. Daft Punk -  Give Life Back to Music\n";

	 System.out.print("Enter Song Number: ");
	 songNum = stdIn.nextLine();

	/* search for the song */
	//insertion
	 songIndex = songs.indexOf(songNum);
	 eolIndex = songs.indexOf('\n', songIndex);
	 song = songs.substring(songIndex, eolIndex);

 	System.out.println(song);
 	}
}