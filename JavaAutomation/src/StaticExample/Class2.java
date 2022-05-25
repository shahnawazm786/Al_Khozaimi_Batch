package StaticExample;

public class Class2 {

	static int count=0;
	public Class2() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 c=new Class2();
		Class2 c1=new Class2();
		Class2 c2=new Class2();
		Class2 c3=new Class2();

	}

}
