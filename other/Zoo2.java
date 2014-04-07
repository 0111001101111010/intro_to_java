//IT430  pg 426 "zoo"
public class Zoo{

    private static String[] allAnimals;
    private String animals;
    private String location;

}

public Zoo(String[] animals, String location){

this.animals = animals;
this.location = location;
allAnimals += this.animals;

}

public void display() {

   System.out.println("The " + location + "zoo: " + allAnimals);

   }

}//end class Zoo