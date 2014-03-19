
// Program: MapleAccountDriver.java
// Programmer: Lookmai Rattana
// Description: Plant Program
// Date: 3/16/2014

import java.util.Scanner;

public class MapleTreeDriver
{
  public static void main(String[] args)
  {
    String plantDate;
    String germinationDate;
    double height;
    Scanner stdIn = new Scanner(System.in);
    MapleTree item= new MapleTree();
    System.out.print("Enter plant date (dd/mm/yyyy): ");
    plantDate = stdIn.nextLine();
    item.plant(plantDate);

    System.out.print("Enter germination date (dd/mm/yyyy): ");
    germinationDate = stdIn.nextLine();

    System.out.print("Enter observed height in meters: ");
    height = Double.parseDouble(stdIn.nextLine());
    item.germinate(germinationDate,height);

    item.dumpData();
  }
}
