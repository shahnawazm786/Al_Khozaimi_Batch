package class09;

public class NestedLoopTrainglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//startPrint();
		//numberPrint();
		//numberPrint1();
		//numberPrint2();
		numberPrint3();
	}
	static void startPrint() {
		int x=1;
		int y;
		while(x<=4) {
			y=1;
			while(y<=x) {
				System.out.print("*  ");
				y++;
			}
			x++;
			System.out.println();
		}
	}
	
	static void numberPrint() {
		int x=1;
		int y;
		while(x<=4) {
			y=1;
			while(y<=x) {
				System.out.print(y +" ");
				y++;
			}
			x++;
			System.out.println();
		}

	}
	
	static void numberPrint1() {
		int x=1;
		int y;
		while(x<=4) {
			y=x;
			while(y>=1) {
				System.out.print(y +" ");
				y--;
			}
			x++;
			System.out.println();
		}

	}

	static void numberPrint2() {
		int x=1;
		int y;
		while(x<=4) {
			y=1;
			while(y<=x) {
				System.out.print(y +" ");
				y++;
			}
			x++;
			System.out.println();
		}
		//System.out.println(x);
		while(x-2>=1) {
			y=1;
			while(y<=x-2) {
				System.out.print(y +" ");
				y++;
			}
			x--;
			System.out.println();
		}
	}

	static void numberPrint3() {
		int x=1;
		int y;
		int z;
		int a;
		a=7;
		while(x<=7) {
			y=1;
			while(y<=x & x<=4) {
				System.out.print(y +" ");
				y++;
			}
		
			System.out.println();
			z=1;
			while(z<=(a-x) & x>=4) {
				//System.out.println(x-a);
				//System.out.println(a);
				System.out.print(z+" ");
				z++;
			}
			
			x++;
		}
		
		
	}
	
}
