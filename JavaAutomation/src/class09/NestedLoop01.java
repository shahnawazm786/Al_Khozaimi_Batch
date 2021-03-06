package class09;

public class NestedLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printA16Times();
		printA16TimesByLoop();
		System.out.println("Output by using nested loop");
		printA16TimesByNestedLoop();
	}
	static void  printA16Times() {
		// 16 times 'A'
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
	}
	static void printA16TimesByLoop() {
		int x=1;
		while(x<=16) {
			System.out.print("A  ");
			if(x%4==0) {
				System.out.println();
			}
			x++;
		}
	}
	static void printA16TimesByNestedLoop() {
		int x=1;
		while(x<=4) // used for rows
		{
			int y=1;
			while(y<=4) {
				System.out.print("A ");
				y++;
			}
			System.out.println();
			x++;
		}
	}
}
