package ExceptionExample;

import java.util.Scanner;

public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ->");
		a=sc.nextInt();
		System.out.println("Enter number ->");
		b=sc.nextInt();
		System.out.println("Statement 1");
		try {
		System.out.println("Statement 2 -> "+ a/b); // b=0
		}catch(ArithmeticException ae) {
			System.out.println("B =" + b);
			System.out.println("Please user other value");
		}
		System.out.println("Statement 3");
		System.out.println("Statement 4");
	}

}
