package class10;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//doWhile();
		//doWhileNumberPrint();
		inputNumber();
	}
	static void doWhile() {
		do {
			System.out.println("Hello!!!");
		}while(false);
	}
	
	static void doWhileNumberPrint() {
		// 1 to 10 by using do -while
		int x=1;
		do {
			System.out.println(x);
			x++;
		}while(x<=10);
	}
	static void inputNumber() {
		int x;
		char ans;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter number : -");
			x=sc.nextInt();
			System.out.println("X =" +x);
			System.out.println("Do you want to enter more number?");
			ans=sc.next().charAt(0);	
		}while(ans=='Y'| ans=='y');
	}

}
