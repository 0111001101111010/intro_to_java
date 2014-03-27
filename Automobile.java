// Program: Automobile
// Programmer: Stanely Zheng
// Description: Describe some Automobiles
// Date: 3/35/2014

import java.util.Scanner;

public class Automobile
{
	String make;
	String color;
	void setMake(String m){
		make=m;
	};
	void setColor(String c){
		color=c;
	};
	void print(){
		System.out.println(make + " " + color);
	};
}
