import java.util.Scanner;

public class MapleTreeDriver
{
  public static void main(String[] args)
  {
    String plantDate = "";
    String germinationDate = "";
    double height = 0;
    MapleTree tree= new MapleTree();
    Scanner stdIn = new Scanner(System.in);
    System.out.print("Enter plant date (dd/mm/yyyy): ");
    plantDate = stdIn.nextLine();
    tree.plant(plantDate);

    System.out.print("Enter germination date (dd/mm/yyyy): ");
    germinationDate = stdIn.nextLine();

    System.out.print("Enter observed height in meters: ");
    height = Double.parseDouble(stdIn.nextLine());
    tree.germinate(germinationDate,height);

    //create and instantiate
    MapleTree otherTree = new MapleTree(plantDate,germinationDate,height);

    tree.dumpData();
  } // end main
} // end MapleDriver
