package class12;

import java.util.Scanner;

public class TypesOfMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addTwoNumber();
		int abc=0;
	//	abc=addTwoNumber1();
		System.out.println("Total is "+ abc);
	//	System.out.println(addTwoNumber1());
		swapNumber(500,600);
		System.out.println(reverseString("mumbai"));
	}
	// Function 
	//1. Non Paramter & No return type
	static void addTwoNumber() {
		int num1;
		int num2;
		int total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number -> ");
		num1=sc.nextInt();
		System.out.println("Enter second number -> ");
		num2=sc.nextInt();
		total=num1 + num2;
		System.out.println("Addition of " +num1 + " and "+ num2 + " => "+total);
	}
	//2. Non paramter & return type
	static int addTwoNumber1() {
		int num1;
		int num2;
		int total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number -> ");
		num1=sc.nextInt();
		System.out.println("Enter second number -> ");
		num2=sc.nextInt();
		total=num1 + num2;
		//System.out.println("Addition of " +num1 + " and "+ num2 + " => "+total);
		return total;
	}
	
	// 3. Parameter & no return type
	static void swapNumber(int x,int y) {
		System.out.println("X =" + x + " Y ="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X =" + x + " Y ="+y);
	}
	
	// 4. Parameter & return type
	static String reverseString(String str) {
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		return rev;	
	}
	
}
