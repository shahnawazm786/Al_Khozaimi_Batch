package class02;

public class PreIncrementPostIncrementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pre and Post
		// Opreator used before operand that is called Pre
		// First Increment the assignment
		// Operator used after operand that is called Post
		
		int a=100;
		System.out.println(++a); //101
		int b=200;
		System.out.println(b++); // 200
		System.out.println(b); // 201
		
		int res= ++a;
		System.out.println(res); //102
		res=b++;
		System.out.println(res);// 201
		System.out.println(b); // 202
	}

}
