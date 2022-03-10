package class04;

import java.util.Scanner;


public class IfElseConditionalConstructExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		//Scanner sc=new Scanner(System.in);
		c='A';
		//ignoreAlphabet(c);
		trueExample();
	}
	static void ignoreAlphabet(char alpha) {
		// A to Z
		if(alpha>='A' & alpha<='Z') {
			System.out.println("You entered Capital alphabet");
		}
		else {
			System.out.println("Integer value");
		}
		// a to z
		if(alpha>='a' & alpha<='z') {
			System.out.println("You entered small alphabet");
		}
		else
		{
			System.out.println("You entered Integer");
		}
	}
	
	static void trueExample() {
		if(false) {
			System.out.println("I am true - if block is executed");
		}
		else {
			System.out.println("I am false - else block is executed");
		}
	}
	

}
