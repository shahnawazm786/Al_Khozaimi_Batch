package class11;

public class FindOutHighestNumberFromIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks={45,90,67,35,50,87,92};
		int temp=marks[0];// temp=0 or -1 
		System.out.println(temp);
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>temp) {
				temp=marks[i];
			}
		}
		System.out.println("Highest marks is "+ temp);
	}

}
