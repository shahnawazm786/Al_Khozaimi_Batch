package class02;

public class BooleanOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// True or False
		// compare -> number or string or character or date
		// Boolean Operator (>,<,>=,<=,==,!=)
		// > operator -> left value operator right value  - 
		// 500 > 300 -> True
		System.out.println("Opertor => \">\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (500>300));
		// 400 > 600 -> False
		System.out.println("Opertor => \">\"");
		System.out.println("Expected value " + "false");
		System.out.println("Actual value "+ (400>600));

		// < operator -> left value operator right value
		// 200 < 500 - True
		System.out.println("Opertor => \"<\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (200<500));
		// 500 < 400  - False
		System.out.println("Opertor => \"<\"");
		System.out.println("Expected value " + "false");
		System.out.println("Actual value "+ (500<400));

		// == left value operator right value
		// 100 == 100 - True
		System.out.println("Opertor => \"==\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (100==100));
		// 200 == 100 - False
		System.out.println("Opertor => \"==\"");
		System.out.println("Expected value " + "False");
		System.out.println("Actual value "+ (200==100));
		// 100 == 200 - False
		System.out.println("Opertor => \"==\"");
		System.out.println("Expected value " + "False");
		System.out.println("Actual value "+ (100==200));

		// >= left value operator right value
		// 500 >= 300 => (500 > 300 or 500 == 300) => True or False => True
		System.out.println("Opertor => \">=\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (500>=300));
		// 200 >= 500 => ( 200 > 500 or 200 == 500 ) => False or False => False
		System.out.println("Opertor => \">=\"");
		System.out.println("Expected value " + "false");
		System.out.println("Actual value "+ (200>=500));
		// 200 >= 200  => ( 200 > 200 or 200 == 200) => False or True => True
		System.out.println("Opertor => \">=\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (200>=200));

		// <= left value operator right value
		// 300 <= 500 => (300 < 500 or 300 == 500) => True or False => True
		System.out.println("Opertor => \"<=\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (300<=500));
		// 500 <= 300 => ( 500 < 300 or 300 == 500 ) => False or False => False
		System.out.println("Opertor => \"<=\"");
		System.out.println("Expected value " + "false");
		System.out.println("Actual value "+ (500<=300));
		// 300 <= 300  => ( 300 < 300 or 300 == 300) => False or True => True
		System.out.println("Opertor => \"<=\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (300<=300));

		// != left value operator right value
		// 100 != 100 - False
		System.out.println("Opertor => \"!=\"");
		System.out.println("Expected value " + "false");
		System.out.println("Actual value "+ (100!=100));
		// 200 != 100 - True
		System.out.println("Opertor => \"!=\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (200!=100));
		// 100 != 200 - True
		System.out.println("Opertor => \"!=\"");
		System.out.println("Expected value " + "true");
		System.out.println("Actual value "+ (100!=200));
		// 100 == 100 - Not True => False
		
		
		

	}

}
