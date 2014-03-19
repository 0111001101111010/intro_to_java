
// Program: MapleTree
// Programmer: Lookmai Rattana
// Description: MapleTree.java
// Date: 3/16/2014

public class MapleTree
{
  private String plantDate;
  private String germinationDate;
  private double height;

  public MapleTree()
  {
    this.plantDate = "";
    this.germinationDate = "" ;
    this.height = 0;
  }

  public MapleTree(String p, String g, double h)
  {
    this.plantDate = p;
    this.germinationDate = g;
    this.height = h;
  }
  public void plant(String p){
    this.plantDate = p;
  };
  public void germinate(String g, double h){
    this.germinationDate = g;
    this.height = h;
  };
  public void dumpData(){
      System.out.println("Plant date = " + plantDate + "\nGerminate date = " + germinationDate + " \nInitial height " + height + " meters ");
  };
}

