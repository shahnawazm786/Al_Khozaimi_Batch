package ExceptionExample;

import java.util.*;
public class CustomExceptionImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double bal=0.0;
		System.out.println("Enter your account balance");
		bal=sc.nextDouble();
		try {
		if(bal<0) {
			
			throw new BalanceException();
		}
		else {
			System.out.println("Your is balance ->"+bal);
		}
		}catch(BalanceException be) {
			be.printStackTrace();
		}
	}

}
