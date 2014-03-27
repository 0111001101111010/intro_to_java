// Program: Automobile
// Programmer: Stanely Zheng
// Description: Describe some Automobiles
// Date: 3/35/2014

import java.util.Scanner;

public class AutomobileDriver
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);

    int numCars;
    String color = "";
    String make = "";
    boolean selection = false;
    boolean selectionB = false;
    System.out.println("How many cars do you want to consider? ");
    numCars=Integer.parseInt(stdIn.nextLine());

    for (int i=0; i< numCars; i++){
      Automobile vehicle = new Automobile();
          while(!selection){
            System.out.println("select one of the following makes between buick, cadillac, and pontiac, (b,c,p)");
            String month = stdIn.nextLine();
            switch (month) {
                case "b":  make = "Buick";
                         selection=true;
                         break;
                case "c":  make = "Cadillac";
                         selection=true;
                         break;
                case "p":  make = "Pontiac";
                         selection=true;
                         break;
                default:
                         System.out.println("invalid selection please choose between buick, cadillac, and pontiac");
                         break;
            }
          }
            // Select color
          while(!selectionB){
            System.out.println("select one of the colors red, blue or green (r,g,b)");
            String month = stdIn.nextLine();
            switch (month) {
                case "r":
                        color = "Red";
                         selectionB=true;
                         break;
                case "g":  color = "Green";
                         selectionB=true;
                         break;
                case "b":  color = "Blue";
                         selectionB=true;
                         break;
                default:
                         System.out.println("invalid selection please choose between buick, cadillac, and pontiac");
                         break;
            }
          }
      vehicle.setMake(make);
      vehicle.setColor(color);
      vehicle.print();
      if (i>=0){
      selection = false;
      selectionB = false;
      }
    }
   }
}
