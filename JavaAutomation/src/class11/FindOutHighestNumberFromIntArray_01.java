package class11;

public class FindOutHighestNumberFromIntArray_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {-17,-10,-8,-9,-11};
		int temp=0;//temp=marks[0] -> is best practice
		for(int i=0; i<marks.length;i++) {
			if(marks[i]>temp) {
				temp=marks[i];
			}
		}
		System.out.println("Highest marks -> "+temp);
	}

}
