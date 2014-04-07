/*
* Name: Stanley Zheng
* Description: Party Class
* Date: 4/03/2014
* Filename: Party.java
*/

import java.io.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Party{

	String hostName;
	int maxGuests;
	List<String> guestListB  = new ArrayList<String>();

	Party(int mG, String host){
		maxGuests = mG;
		hostName = host;
	}

	boolean isOnList(String guest){
	//duplicates
		boolean duplicate=false;
	//if list is full already
	//look for duplicates
		for (String s : guestListB)
			if(guest==s){
				duplicate = true;
			}
		return duplicate;
	}

	//addGuest method
	void addGuest(String guest){

	if(guestListB.size() < maxGuests || isOnList(guest)){
		if(!isOnList(guest)){
			 System.out.println(guest +" Has been Added to the list");
			guestListB.add(guest);
		}
		else
	 		System.out.println(guest +" is already on the guest list.");
		 }
	else
		System.out.println(guest + " cannot come to the party the guest list is full.");
	}

	//isonList guest method
	//print party
	void printParty(){
		     System.out.println("Guest list for " + hostName+"'s party:");
		for (String s : guestListB)
		     System.out.println(s);
	};
}//end of class
