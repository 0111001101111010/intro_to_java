public class MapleTree
{
  private int numerator;
  private int denominator;
  private double quotient;
  //Date strings dd/mm/yyyy
  private String plantDate;
  private String germinationDate;
  private double height;

  public MapleTree()
  {
    this.plantDate = "";
    this.germinationDate = "";
    this.height = 0;
  }

  public MapleTree(String pd, String gd, double h)
  {
    this.plantDate = pd;
    this.germinationDate = gd;
    this.height = h;
  }
  public void plant(String pd){
    this.plantDate = pd;
  };
  public void germinate(String gd, double h){
    this.germinationDate = gd;
    this.height = h;
  };
  public void dumpData(){
  // Plant date = 15/04/2003
  // Germinate date = 12/06/2003
  // Initial height = 0.0070 meters
  System.out.println("Plant date = " + plantDate + "\nGerminate date = " + germinationDate + "\nInitial height "  + height + " meters\n");
  };
}

