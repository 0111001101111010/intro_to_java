/*
*	Project name: BodyMassIndex.java
*	Name: Lookmai Rattana
*	Date: 04/22/14
*	Description: Body Mass Index calculator
*/

import java.util.Scanner;
import java.text.DecimalFormat;

class BodyMassIndex {
	public static void main(String[] args)
    {

	double heightInInches;
	double weightInPounds;
	double bmi;
  	Scanner sc = new Scanner(System.in);
    boolean check1 = false;
    boolean check2 = false;

    System.out.println("Enter height in inches: ");
    do {
        if (check1){
            System.out.println("Invalid inch value Must be a positive number.");
        }
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid inch value Must be a decimal number.");
            sc.next();
        }
        check1 = true;
        heightInInches = sc.nextInt();
    } while (heightInInches <= 0);

    System.out.println("Enter Weight in Pounds: ");
    do {
        if (check2){
            System.out.println("Invalid pounds value Must be a positive number.");
        }
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid pounds value. must be a decimal number");
            sc.next();
        }
        check2 = true;
        weightInPounds = sc.nextInt();
    } while (weightInPounds <= 0);

    DecimalFormat d = new DecimalFormat("0.000");
    bmi = (704*weightInPounds)/(heightInInches*heightInInches);
    System.out.println("body mass index = " + d.format(bmi));

	}
}