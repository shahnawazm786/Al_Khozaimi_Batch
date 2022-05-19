
package CompileTimePolyMorph;

// Compile time polymorphism, Overloading
public class CmpTimePolyMor {
	
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CmpTimePolyMor cm=new CmpTimePolyMor();
		System.out.println("Data type -double and 2 para -> "+cm.add(89.99, 90.99));
		System.out.println("Data type -double and int and 2 para -> "+cm.add(89.99, 90));
		System.out.println("Data type -int and 2 para -> "+cm.add(89, 90));
		System.out.println("Data type -int and 3 para -> "+cm.add(89, 90,70));
	}

}
