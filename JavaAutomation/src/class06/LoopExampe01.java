package class06;

public class LoopExampe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		while(x<=100000) {
			System.out.println("Hello!!! =>" + x + "time\'s (" + x + "<=5) ="+(x<=5));
			x=x+1;//x+=1, x++
		}//closing while
		System.out.println( x + "time\'s (" + x + "<=5) ="+(x<=5));
	}

}
