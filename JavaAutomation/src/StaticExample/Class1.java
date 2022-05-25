package StaticExample;

public class Class1 {

	int a=0;
	public Class1() {
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Class1 c=new Class1(); //1 
		Class1 c1=new Class1(); //1 -> 2
		Class1 c2=new Class1(); //1 -> 3
		Class1 c4=new Class1();//1 ->4
	}
}
