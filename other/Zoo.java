//Anthony Navarrete
//IT 430
//HW7 #2 pg. 426 ex. 4

public class Zoo
{
     //declare variables
     String[] zooAnimals;
     String zooName;
     int size;

     //constructor
     public Zoo()
     {
          size = 0;
     }//end constructor

     //constructor
     public Zoo(String[] animals, String str)
     {
          //zooAnimals array
          zooAnimals = new String[animals.length];
          zooName = str;
          size = zooAnimals.length;

          //copy
          for (int i = 0; i < animals.length; i++)
          {
              zooAnimals[i] = animals[i];
          }
     }//end constructor

     //display method
     public void display()
     {
          if(size == 0)
          {
              System.out.println("Zoo is vacant.");
          }
          else
          {
              System.out.print(zooName + "zoo: ");
              for (int i = 0; i < zooAnimals.length; i++)
              {
                   if(i < zooAnimals.length - 1)
                        System.out.print(zooAnimals[i] + ", ");
                   else
                        System.out.print(zooAnimals[i]);
              }
              System.out.println();
          }
     }//end display
}//end class