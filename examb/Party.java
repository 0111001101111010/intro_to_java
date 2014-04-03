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
		guestListB.add(guest);
	}
	//isonList guest method
	//print party
	void printParty(){
        while(i < t1.size()) {
          System.out.println(t1.get(i));
          i++;
        }
    };
}//end of class

//store the host name, and the guest name