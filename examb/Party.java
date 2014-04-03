import java.io.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Party{
	 //Three instance variables that hold respectively
      //the actual number of guestsi
	  //an array of the names of the guests and
	  // the party hosts name
int[] guestList;
String hostName;
int maxGuests;
List<String> guestListB  = new ArrayList<String>();
Party(String host, int mG){
	maxGuests = mG;
	guestList = new int[maxGuests];
	hostName = host;
	}

	//addGuest method
void addGuest(String guest){

boolean duplicate=false;
for (String s : guestListB)
	if(guest==s)
		duplicate = true;
	if(!duplicate){
		if(guestListB.size() < maxGuests){
		    System.out.println(guest +" Has been Added to the list");
			guestListB.add(guest);
		}
		else
		    System.out.println("The Party is Full");
		}
	else
 		System.out.println(guest +" is already on the list");
 }

	//isonList guest method
	//print party
	void printParty(){
		     System.out.println("Your host is " + hostName);
		for (String s : guestListB)
		     System.out.println(s);
    };
}//end of class

//store the host name, and the guest name