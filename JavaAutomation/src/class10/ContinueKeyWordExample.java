package class10;

public class ContinueKeyWordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		continueExample();
	}
	static void continueExample() {
		for(int i=1;i<=10;i++) {
			if(i<=5)
				continue;
			System.out.println(i); // 6,7,8,9,10
		}
	}

}
