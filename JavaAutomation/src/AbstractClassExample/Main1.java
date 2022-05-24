package AbstractClassExample;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstDemo1 demo1=new AbstDemo1();
		demo1.Method1();
		demo1.Method2();
		demo1.Method3();
		demo1.Method4();
		
		// Overriding
		
		System.out.println("Object defined for Abstract class");
		
		AbsClass1 abs=new AbstDemo1();
		abs.Method2();
		abs.Method3();
		abs.Method4();
	}

}
