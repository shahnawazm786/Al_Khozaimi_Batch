package class05;

import java.util.Scanner;

public class DayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter day");
		int d=s.nextInt();
		//printDay(d);
		printDayUsingSwitchCase(d);
	}// main method close
	static void printDay(int day) {
		if(day==1) {
			System.out.println("Sunday");
		} else if(day==2) {
			System.out.println("Monday");
		}else if(day==3) {
			System.out.println("Tuesday");
		}else if(day==4) {
			System.out.println("Wednesday");
		}else if(day==5) {
			System.out.println("Thursday");
		}else if(day==6) {
			System.out.println("Friday");
		}else if(day==7) {
			System.out.println("Saturday");
		}
		else  {
			System.out.println("Wrong day");
		}// else close
	}// dayPrint closing
	
	static void printDayUsingSwitchCase(int day) {
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Wrong day");
			
		}// switch closing
	}// printDayUSingSwitchCase closing

}// class closing
