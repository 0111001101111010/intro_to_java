public class Zoo{
	//optional driver
	public static void main(String[] args) {

	Zoo nyc = new Zoo("NYC", "Giraffe","Lion");
	Zoo la = new Zoo("LA", "Dog","Cat","Fish");
	nyc.display();
	la.display();
	}

    private  String[] animals;
    private  String location;

	public Zoo(String location, String... animals){
		this.location = location;
		this.animals = animals;
	}

	public void display() {
	   System.out.println("In the " + location + " zoo");
	   for (String s : animals)
	   	  System.out.println("a " + s);
	   }
}