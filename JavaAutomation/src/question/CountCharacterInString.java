package question;

import java.util.Scanner;

public class CountCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : -");
		str=sc.next();
		System.out.println("Enter the character to be count :- ");
		sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		System.out.println("Count of -> "+c+" is ->"+charCount(str,c));
	}
	static int charCount(String s,char c) {
		int noOfCount=0;
		for(char c1 : s.toCharArray()) {
			if(c==c1) {
				noOfCount++;	
			}
		}
		return noOfCount;
	}

}
