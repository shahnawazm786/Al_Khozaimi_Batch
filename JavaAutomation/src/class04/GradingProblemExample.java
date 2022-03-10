package class04;

import java.util.Scanner;

public class GradingProblemExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");
		double per=sc.nextDouble();
		gradingProblemUsingIfElse(per);
	}
	static void gradingProblemUsingIfElse(double precentage) {
		if(precentage>90) {
			System.out.println("Excellent");
		}else if(precentage<=89.99 & precentage >=80) {
			System.out.println("Very Good");
		}else if(precentage<=79.99 & precentage>=60) {
			System.out.println("Good");
		}else if(precentage<=59.99 & precentage >=50) {
			System.out.println("Fair");
		}
		else {
			System.out.println("Poor");
		}
	}
	

}
