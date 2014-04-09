public class Zoo{
    private  String[] animals;
    private  String location;

	public Zoo(String l, String... a){
		location = l;
		animals = a;
	}
	public void display() {
	   System.out.println("The Zoo in " + location + " has:");

	   for (int i =0; i<animals.length;i++ ){
	   	  System.out.println("a " + animals[i]);
	   }
	}
}