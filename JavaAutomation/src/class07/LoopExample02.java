package class07;

public class LoopExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printEvenNumberApporach1();
		//float res=12.0f/5.0f;
		//System.out.println(res);
		printEvenNumberApporach2();
	}
	static void printEvenNumberApporach1() {
		int x=2;
		while(x<=100) {
			//System.out.print("\t"+x);
			/*if(x==52)
			{
				System.out.println();
			}*/	/*if(x==20) {
				System.out.println();
			}else if(x==40) {
				System.out.println();
			}else if(x==60)
			{
			System.out.println();	
			}
			else if (x==80) {
				System.out.println();
			}*/
			if(x%20==0) {
				System.out.println();
			}
			System.out.print("  "+x);
			x+=2; // loop 50, condition 
		}
		
	}
	static void printEvenNumberApporach2() {
		int y=1;
		while(y<=100) {
			if(y%2==0) { //100 conidtion 
			System.out.print(y+"  ");
			}
			y++; // loop 100 
		}
	}
}
