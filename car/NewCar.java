class NewCar extends Car{

	public String color;
	NewCar(double p, String c){
		price = p*2;
		color = c;
	}
	void display(){
		System.out.println("price = $"+ price + ", color = " + color);
	}
	boolean equals(NewCar carA){
		if(carA.price==price &&carA.color.equals(color)){
			return true;
		}
		else{
			return false;
		}
	}
}