package class08;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :- ");
		x=sc.nextInt();
		//checkPrimeNumber(x);
		checkPrimeNumberApproach2(x);

	}
	static void checkPrimeNumber(int num) { // ctr+a, after ctr+i
		boolean isNotPrime=false;

		int y=2;
		while(y<num) 
		{
			if(num%y==0) 
			{
				isNotPrime=true;
				break;
			} // closing if
			y++;
		} // closing while loop
		if(isNotPrime) 
		{
			System.out.println(num + " is not a prime number");
		}
		else {
			System.out.println(num + " is a prime number");
		}
	}
	static void checkPrimeNumberApproach2(int num) { // ctr+a, after ctr+i
		boolean isNotPrime=false;

		int y=2;
		int val=(num/2)+1;
		//while(y<((num/2)+1))
		while(y<=val)
		{
			if(num%y==0) 
			{
				isNotPrime=true;
				break;
			} // closing if
			y++;
		} // closing while loop
		if(isNotPrime) 
		{
			System.out.println(num + " is not a prime number");
		}
		else {
			System.out.println(num + " is a prime number");
		}
	}


}
