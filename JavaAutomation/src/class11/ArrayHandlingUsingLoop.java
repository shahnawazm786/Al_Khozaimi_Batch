package class11;

import java.util.Scanner;

public class ArrayHandlingUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Date Input");
		for(int i=0; i<5; i++) {
			System.out.println("Enter number");
			a[i]=sc.nextInt();
		}
		System.out.println("Date Output");
		for(int j=0; j<a.length;j++) {
			System.out.println("Data is ->"+a[j]);
		}
	}

}
