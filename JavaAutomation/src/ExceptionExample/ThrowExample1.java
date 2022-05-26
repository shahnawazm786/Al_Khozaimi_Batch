package ExceptionExample;

import java.util.Scanner;

public class ThrowExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of voter ->");
		age=sc.nextInt();
		if(age<18) {
			throw new Exception("You are not suppose to caste a vote");
		}
		else
		{
			System.out.println("You are voter!!! Welcome ");
		}
		
	}

}
