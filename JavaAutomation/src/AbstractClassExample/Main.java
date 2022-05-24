package AbstractClassExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstDemo demo=new AbstDemo();
		demo.Method1();
		//AbsClass abs=new AbsClass();
		AbsClass abs=new AbstDemo(); // we create the object of 
									// Abstract class using the reference of sub/child class of abstract class
	}

}
