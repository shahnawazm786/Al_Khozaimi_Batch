package ExceptionExample;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Except4 ex=new Except4();
		try {
			ex.message();
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception Occured");
			ae.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}

}
