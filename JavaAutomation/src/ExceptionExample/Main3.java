package ExceptionExample;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Except5 e=new Except5();
		try {
			e.display();
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e1) {
			System.out.println("Exception class ");
			e1.printStackTrace();
		}
	}

}
