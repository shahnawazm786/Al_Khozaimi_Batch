package class03;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Three numbers are given, show greatest among the three
		// used nested if
		
		int x, y, z;
		x=100;
		y=200;
		z=300;
		
		boolean flag1;
		boolean flag2;
		flag1=x>y;
		flag2=x>z;
		if(flag1) {
			if(flag2) {
				System.out.println("X is greatest");
			}
			else 
			{
				System.out.println("Z is greatest");
			}
			
		}
		else
		{
			flag2=y>z;
			if(flag2) {
				System.out.println("Y is greatest");
			}
			else
			{
				System.out.println("Z is greatest");
			}
		}
		checkThreeNumber(300,200,400);
	}

	
static void checkThreeNumber(int a,int b,int c) {
	if(a>b & a>c) {
		System.out.println("A is greater");
	}else if(b>c & b > a) {
		System.out.println("B is greater");
	}
	else
	{
		System.out.println("C is greater");
	}
	
}
	
}
