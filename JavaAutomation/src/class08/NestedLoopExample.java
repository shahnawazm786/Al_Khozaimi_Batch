package class08;

public class NestedLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showPatter();
	}
	static void showPatter() {
		int uLoop=1;
		int iLoop;
		while(uLoop<=4) {
			iLoop=1;
			while(iLoop<=5) {
				System.out.print("1  ");
				iLoop++;
			}
			System.out.println();
			uLoop++;
		}
	}

}
