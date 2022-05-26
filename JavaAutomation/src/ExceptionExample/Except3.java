package ExceptionExample;

public class Except3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bal,emi;
		
		bal=100;
		emi=0;
		try {
		System.out.println(bal/emi);
		System.out.println(bal);
		System.out.println(emi);
		}
		catch(ArithmeticException ae) {
			System.out.println(bal);
			System.out.println(emi);
			
			System.out.println("Exception raised");
			System.out.println( "EMI is " + emi + " now");
		 }
		finally {
			System.out.println("Finally Block Executed");
			bal=-1;
			emi=-1;
		System.out.println(bal);
		System.out.println(emi);
		}

	}

}
