/*
o	Project name: BodyMassIndex
o	Name: Stanley Zheng
o	Date: April 23, 2014
o	Description: BodyMassIndex calculator
*/
import java.util.Scanner;


class BodyMassIndex {
	public static void main(String[] args) {

	double height;
	double weight;
	double bmi;

  	Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Please enter a positive height in inches!");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid inch value Must be a decimal number.");
            sc.next(); // this is important!
        }
        height = sc.nextInt();
    } while (height <= 0);

//get Weight
    do {
        System.out.println("Enter Weight in Pounds");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid pounds value. must be a decimal number");
            sc.next(); // this is important!
        }
        weight = sc.nextInt();
    } while (weight <= 0);

    bmi = (704*weight)/(height*height);
	bmi = (double) Math.round(bmi * 100) / 100;
    System.out.println("BMI is:" + bmi);
		//isValid weight + and int
		//isValid height + and decimal

	}
}