class UsedCar extends Car{

	public int mileage;
	UsedCar(int p, int m){
		price = p;
		mileage = m;
	}
	void display(){
		System.out.println("price = $"+ price + ", mileage = " + mileage);
	}
	boolean equals(UsedCar carA){
		if((carA.price==price) && (carA.mileage == mileage)){
			return true;
		}
		else{
			return false;
		}
	}
}