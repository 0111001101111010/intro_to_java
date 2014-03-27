import java.util.Scanner;

public class Automobile{

	String make = "";
	String color = "";
	void setMake(String m){
		make=m;
	};
	void setColor(String c){
		color=c;
	};
	String getMake(){
		return make;
	};
	String getColor(){
		return color;
	};
	void print(){
		System.out.println(make + " " + color);
	};
}
