// Program: Automobile Program
// Programmer: Lookmai Rattana
// Date: 3/25/2014

import java.util.Scanner;

public class AutomobileDriver
{
  public static void main(String[] args){

    Scanner stdIn = new Scanner(System.in);

    int cars = 0;
    String color = "";
    String make = "";
    boolean colorPick = false;
    boolean makePick = false;
    System.out.println("How many cars do you want to consider?");
    cars = Integer.parseInt(stdIn.nextLine());

    for (int i=0; i< cars; i++){
    Automobile car = new Automobile();
        while(!colorPick)
        {
          System.out.println("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
          String input = stdIn.nextLine();
          switch (input) {
              case "b":  make = "Buick";
                       colorPick=true;
                       break;
              case "c":  make = "Cadillac";
                       colorPick=true;
                       break;
              case "p":  make = "Pontiac";
                       colorPick=true;
                       break;
              default:
                       System.out.println("The only valid selections are 'b', 'c', or 'p'");
                       break;
          }
        }
        while(!makePick)
        {
          System.out.println("Select blue, green, or red (b,g,r): ");
          String input = stdIn.nextLine();
          switch (input) {
              case "r":
                      color = "Red";
                       makePick=true;
                       break;
              case "g":  color = "Green";
                       makePick=true;
                       break;
              case "b":  color = "Blue";
                       makePick=true;
                       break;
              default:
                       System.out.println("The only valid selections are 'r', 'g', or 'b'");
                       break;
          }
        }
      car.setMake(make);
      car.setColor(color);
      car.print();
          if (i>=0){
          colorPick = false;
          makePick = false;
          }
    }
  }
}
