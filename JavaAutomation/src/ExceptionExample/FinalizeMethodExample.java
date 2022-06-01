package ExceptionExample;

public class FinalizeMethodExample {

	int a=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeMethodExample f=new FinalizeMethodExample();
		System.out.println(f.a);
	
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	
	}

}
