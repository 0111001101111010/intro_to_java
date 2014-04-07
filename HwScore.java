/*
* Name: Stanley Zheng
* Description: Party Class
* Date: 4/03/2014
* Filename: Party.java
*/

import java.io.*;
// import java.util.List;
// import java.util.Arrays;
// import java.util.ArrayList;
class HwScore{
	public static void main(String[] args) {
	}
//Instance
	private double assignmentEarnedPoints;
	private double assignmentPossiblePoints;
//static
	private static double totalEarnedPoints;
	private static double totalPossiblePoints;
	HwScore(double earned, double possible){
		assignmentPossiblePoints = assignmentPossiblePoints + possible;
		totalPossiblePoints = totalPossiblePoints + possible;
		assignmentEarnedPoints = earned;
		totalEarnedPoints = totalEarnedPoints + earned;
	}
	public void printGrade(){
		System.out.println("On this homework, you earned " + assignmentEarnedPoints + " out of " + assignmentPossiblePoints +" possible points: " + grade(assignmentEarnedPoints,assignmentPossiblePoints));
	}
	public void printOverallGrade(){

		System.out.println("Overall, you earned " + totalEarnedPoints + " out of " + totalPossiblePoints +" possible points: " + grade(totalEarnedPoints,totalPossiblePoints));
	}
	private String grade(double e, double p){
		//A = 0.9, B = 0.8, C = 0.7, D = 0.6
		double g = (e/p);
		//System.out.println(g);
		if (g > .9){
			return "A";
		}
		else if (g > .8){
			return "B";
		}
		else if (g > .7){
			return "C";
		}
		else if (g > .6){
			return "D";
		}
		return "F";
	}
}