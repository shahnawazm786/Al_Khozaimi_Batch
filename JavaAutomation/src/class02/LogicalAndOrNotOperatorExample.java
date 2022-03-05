package class02;

public class LogicalAndOrNotOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// AND -> used to connect multiple boolean operator
		// AND -> if all result of the connected boolean operator is true -> final result will be true
		// AND -> if any connected boolean operator is false -> final result will be false

		// OR -> used to connect multiple boolean operator
		// OR -> if all result of the connected boolean operator is false -> final result will be false
		// OR -> if any connected boolean operator is true -> final result will be true


		// 100 > 50 & 500 > 200 & 300 > 50 
		// True & True & True => final True
		
		System.out.println("& Operator");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (100>50 & 500>200 & 300>50));
		
		// 100 > 50 & 500 > 200 & 300 < 50 
		// True & True & False => final False 

		System.out.println("& Operator");
		System.out.println("Expected value " + "false");
		System.out.println("Actual value "+ (100>50 & 500>200 & 300<50));
		
		// 100 < 50 | 500 < 200 | 300 > 50 
		// False & False & True => final True
		

		System.out.println("| Operator");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (100<50 | 500<200 | 300>50));
		
		// 100 < 50 | 500 < 200 & 300 < 50 
		// False & False & False => final False
		System.out.println("| Operator");
		System.out.println("Expected value " + "false");
		System.out.println("Actual value "+ (100<50 | 500<200 | 300<50));

		// NOT -> used to connect multiple boolean operator
		// NOT TRUE -> False
		System.out.println("! Operator");
		System.out.println("Expected value " + "false");
		System.out.println("Actual value "+ !(100<50 | 500<200 | 300>50));

		// NOT FALSE -> TRUE
		System.out.println("! Operator");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ !(100<50 | 500<200 | 300<50));

		

	}

}
