package class10;

public class ForLoopPatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patterPrintCharacter();
	}
	static void patterPrintCharacter() {
		for(char c='A';c<='D';c++) {
			for(char d='A'; d<=c;d++) {
				System.out.print(d +"  ");
			}
			System.out.println();
		}
	}

}
