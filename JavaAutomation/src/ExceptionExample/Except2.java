package ExceptionExample;

public class Except2 {
public static void main(String[] args) {
	int bal,emi;

	bal=100;
	emi=0;
	try {
		System.out.println(bal/emi);
		System.out.println(bal);
		System.out.println(emi);
	}
	finally {
		bal=-1;
		emi=-1;
		System.out.println(bal);
		System.out.println(emi);
	}
}
}
