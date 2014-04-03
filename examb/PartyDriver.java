import java.io.*;

class PartyDriver{
	public static void main(String[] args) {
		//test driver
	  Party party = new Party(3, "David Beckham");
	  party.addGuest("Roberto Baggio");
	  party.addGuest("Zinedine Zidane");
	  party.addGuest("Roberto Baggio");
	  party.addGuest("Johan Cruyff");
	  party.addGuest("Diego Maradona");
	  party.printParty();

	}//end of main
}//end of class

