package class05;

import java.util.Scanner;

public class SwitchCaseExampleUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your qualification:->");
		String qual=sc.next();
		getInterviewCall(qual);
		
	}
	static void getInterviewCall(String qualification) {
		switch(qualification) {
		case "MCA":
			System.out.println("Interview for Automation");
			break;
		case "BCA":
			System.out.println("Interview for Manual");
			break;
		case "B.Tech":
			System.out.println("Interview for Database");
			break;
		case "BBA":
			System.out.println("Interview for Sales");
			break;
		case "MBA":
			System.out.println("Interview for Marketing");
			break;
		default:
			System.out.println("Wrong pull");
			
		}
	}

}
